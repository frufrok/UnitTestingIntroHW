package Lesson1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    private static ArrayList<Product> testProducts;
    private Shop shop;

    @BeforeAll
    static void CreateTestProducts() {
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
    void CreateShop() {
        this.shop = new Shop();
    }

    @Test
    void GetSetProducts() {
        this.shop.setProducts( testProducts);
        assertEquals(this.shop.getProducts(),  testProducts);
    }

    @Test
    void sortProductsByPrice() {
        this.shop.setProducts( testProducts);
        ArrayList<Product> sorted = new ArrayList<>(this.shop.sortProductsByPrice());
        assertTrue(sorted.size() == 4
                && sorted.get(0) ==  testProducts.get(2)
                && sorted.get(1) ==  testProducts.get(3)
                && sorted.get(2) ==  testProducts.get(1)
                && sorted.get(3) ==  testProducts.get(0)
        );
    }

    @Test
    void getMostExpensiveProduct() {
        this.shop.setProducts( testProducts);
        assertEquals(this.shop.getMostExpensiveProduct(),  testProducts.get(0));
    }
}