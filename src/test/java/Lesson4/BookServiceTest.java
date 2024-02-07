package Lesson4;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Mock
    private BookRepository repos;

    private BookService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        this.service = new BookService(this.repos);
    }

    @Test
    @DisplayName("Find existing book by ID")
    void findBookByIdExistingBook() {
        when(this.repos.findById("0")).thenReturn(new Book("0", "Some Book", "Some Author"));
        assertEquals("0", this.service.findBookById("0").getId());
        verify(this.repos, times(1)).findById("0");
    }

    @Test
    @DisplayName("Book is not found by ID")
    void findBookByIdBookNotFound() {
        assertNull(this.service.findBookById("0"));
        verify(this.repos, times(1)).findById("0");
    }


    @Test
    void findAllBooks() {
        ArrayList<Book> testBooks = new ArrayList<>();
        when(this.repos.findAll()).thenReturn(testBooks);
        assertEquals(testBooks, this.service.findAllBooks());
        verify(this.repos, times(1)).findAll();
    }
}