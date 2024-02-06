package Lesson1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /*
    Мы хотим улучшить функциональность нашего интернет-магазина.
    Ваша задача - добавить два новых метода в класс Shop:
    Метод sortProductsByPrice(), который сортирует список продуктов по стоимости.
    Метод getMostExpensiveProduct(), который возвращает самый дорогой продукт.
    Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов
    (правильное количество продуктов, верное содержимое корзины).
    Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
    Напишите тесты для проверки корректности работы метода sortProductsByPrice
    (проверьте правильность сортировки). Используйте класс Product для создания
    экземпляров продуктов и класс Shop для написания методов сортировки и тестов.
     */


    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        // Допишите реализацию метода самостоятельно
        return new ArrayList<>(this.getProducts()).stream().sorted(
                Comparator.comparing(p -> ((Integer) p.getCost()))).toList();
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        // Допишите реализацию метода самостоятельно
        return this.sortProductsByPrice().get(this.getProducts().size()-1);
    }

}