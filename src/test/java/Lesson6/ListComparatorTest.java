package Lesson6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListComparatorTest {
    private ListComparator lc;

    @Spy
    private ListComparator spyLc;

    @BeforeEach
    void setUp() {
        ArrayList<Integer> list1 = new ArrayList<>() {
            {
                add(1);
                add(2);
                add(3);
            }
        };
        ArrayList<Integer> list2 = new ArrayList<>() {
            {
                add(2);
                add(3);
                add(4);
            }
        };
        this.lc = new ListComparator(list1, list2);
    }

    private void switchLists() {
        ArrayList<Integer> list1 = this.lc.list1();
        ArrayList<Integer> list2 = this.lc.list2();
        this.lc = new ListComparator(list2, list1);
    }

    private void sameLists() {
        ArrayList<Integer> list1 = this.lc.list1();
        this.lc = new ListComparator(list1, list1);
    }

    @Test
    void getList1Avg() {
        assertEquals(2, this.lc.getList1Avg());
    }

    @Test
    void getList2Avg() {
        assertEquals(3, this.lc.getList2Avg());
    }

    @Test
    @DisplayName("getBiggerListIndex returns 2")
    void getBiggerListIndex_2() {
        assertEquals(2, this.lc.getBiggerListIndex());
    }

    @Test
    @DisplayName("getBiggerListIndex returns 1")
    void getBiggerListIndex_1() {
        this.switchLists();
        assertEquals(1, this.lc.getBiggerListIndex());
    }

    @Test
    @DisplayName("getBiggerListIndex returns 0")
    void getBiggerListIndex_0() {
        this.sameLists();
        assertEquals(0, this.lc.getBiggerListIndex());
    }

    @Test
    @DisplayName("getBiggerListMessage if index returns 2")
    void getBiggerListMessage_2() {
        assertEquals("Второй список имеет большее среднее значение", this.lc.getBiggerListMessage());
    }

    @Test
    @DisplayName("getBiggerListMessage if index returns 2")
    void getBiggerListMessage_1() {
        this.switchLists();
        assertEquals("Первый список имеет большее среднее значение", this.lc.getBiggerListMessage());
    }

    @Test
    @DisplayName("getBiggerListMessage if index returns 2")
    void getBiggerListMessage_0() {
        this.sameLists();
        assertEquals("Средние значения равны", this.lc.getBiggerListMessage());
    }

    @Test
    @DisplayName("List1 is null")
    void constructComparatorIfList1IsNull() {
        assertThrowsExactly(IllegalArgumentException.class, () -> new ListComparator(null, new ArrayList<>()));
    }

    @Test
    @DisplayName("List2 is null")
    void constructComparatorIfList2IsNull() {
        assertThrowsExactly(IllegalArgumentException.class, () -> new ListComparator(new ArrayList<>(), null));
    }

    @Test
    @DisplayName("List1 is empty")
    void constructComparatorIfList1IsEmpty() {
        ArrayList<Integer> list2 = this.lc.list2();
        assertThrowsExactly(IllegalArgumentException.class, () -> new ListComparator(new ArrayList<>(), list2));
    }

    @Test
    @DisplayName("List2 is empty")
    void constructComparatorIfList2IsEmpty() {
        ArrayList<Integer> list1 = this.lc.list1();
        assertThrowsExactly(IllegalArgumentException.class, () -> new ListComparator(list1, new ArrayList<>()));
    }

    @Test
    @DisplayName("Data intervention")
    void dataIntervention() {
        ArrayList<Integer> list1 = this.lc.list1();
        list1.clear();
        assertEquals("Один или оба списка пустые", this.lc.getBiggerListMessage());
    }

}