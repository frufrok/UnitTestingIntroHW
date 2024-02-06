package Lesson1;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class ShopTest {
    private static ArrayList<Product> testProducts;

    private Shop shop;

    @BeforeAll
    static void createTestProducts() {
        testProducts = new ArrayList<>();
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();
        p1.setTitle("Кофе");
        p2.setTitle("Чай");
        p3.setTitle("Сахар");
        p4.setTitle("Молоко");
        p1.setCost(250);
        p2.setCost(150);
        p3.setCost(50);
        p4.setCost(80);
        testProducts.add(p1);
        testProducts.add(p2);
        testProducts.add(p3);
        testProducts.add(p4);
    }

    @BeforeEach
    void createShop() {
        this.shop = new Shop();
    }

    @Test
    @DisplayName("Set and get products")
    void getSetProducts() {
        this.shop.setProducts( testProducts);
        assertEquals(testProducts, this.shop.getProducts());
    }

    @Test
    @DisplayName("Sort products")
    void sortProductsByPrice() {
        this.shop.setProducts( testProducts);
        ArrayList<Product> sorted = new ArrayList<>(this.shop.sortProductsByPrice());
        assertEquals(4, sorted.size());
        assertEquals(testProducts.get(2), sorted.get(0));
        assertEquals(testProducts.get(3), sorted.get(1));
        assertEquals(testProducts.get(1), sorted.get(2));
        assertEquals(testProducts.get(0), sorted.get(3));
    }

    @Test
    @DisplayName("Get the most expensive product")
    void getMostExpensiveProduct() {
        this.shop.setProducts(testProducts);
        assertEquals(testProducts.get(0), this.shop.getMostExpensiveProduct());
    }
}