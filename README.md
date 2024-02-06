# UnitTestingIntroHW

Домашние задания по курсу "Unit-тесты" на GeekBrains.

## Урок 1. Цели и смысл тестирования

### Задача

Задание 1. ** В классе Calculator создайте метод calculateDiscount, 
который принимает сумму покупки и процент скидки и возвращает сумму 
с учетом скидки. Ваша задача - проверить этот метод с использованием 
библиотеки AssertJ. Если метод calculateDiscount получает недопустимые 
аргументы, он должен выбрасывать исключение ArithmeticException. 
Не забудьте написать тесты для проверки этого поведения.

*Задание 2. (необязательное) *
Мы хотим улучшить функциональность нашего интернет-магазина. 
Ваша задача - добавить два новых метода в класс Shop:
Метод sortProductsByPrice(), который сортирует список продуктов 
по стоимости. Метод getMostExpensiveProduct(), который возвращает 
самый дорогой продукт. Напишите тесты, чтобы проверить, что магазин 
хранит верный список продуктов (правильное количество продуктов, 
верное содержимое корзины).
Напишите тесты для проверки корректности работы метода 
getMostExpensiveProduct. Напишите тесты для проверки корректности
работы метода sortProductsByPrice (проверьте правильность сортировки).
Используйте класс Product для создания экземпляров продуктов и класс Shop
для написания методов сортировки и тестов.

### Решение

Домашнее задание размещено в папках "Lesson1" в каталогах 
/srs/main/java и /srs/test/java.

В файле Calculator.java реализован метод 
```calculatingDiscount(double,int)```, 
тесты для которого размещены в файле CalculatorTest.java.

В файле Shop.java реализованы методы
```sortProductsByPrice()``` и ```getMostExpensiveProduct()```, 
тесты для которых размещены в файле ShopTest.java.

##  Урок 2. Знакомство с тестовыми фреймворками

## Задача

Проект Vehicle. Написать следующие тесты с использованием JUnit5:

- Проверить, что экземпляр объекта Car также является экземпляром 
транспортного средства (используя оператор instanceof).
  
- Проверить, что объект Car создается с 4-мя колесами.
  
- Проверить, что объект Motorcycle создается с 2-мя колесами.
  
- Проверить, что объект Car развивает скорость 60 в режиме
тестового вождения (используя метод testDrive()).

- Проверить, что объект Motorcycle развивает скорость 75 в 
режиме тестового вождения (используя метод testDrive()).

- Проверить, что в режиме парковки (сначала testDrive, потом park, 
т.е. эмуляция движения транспорта) машина останавливается (speed = 0).

- Проверить, что в режиме парковки (сначала testDrive, потом park,
т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).

В этом проекте, вы будете работать с проектом "Vehicle", 
который представляет собой иерархию классов, включающую 
абстрактный базовый класс "Vehicle" и два его подкласса
"Car" и "Motorcycle".

Базовый класс "Vehicle" содержит абстрактные методы 
"testDrive()" и "park()", а также поля "company", 
"model", "yearRelease", "numWheels" и "speed".

Класс "Car" расширяет "Vehicle" и реализует его абстрактные
методы. При создании объекта "Car", число колес устанавливается 
в 4, а скорость в 0. В методе "testDrive()" скорость устанавливается
на 60, а в методе "park()" - обратно в 0.

Класс "Motorcycle" также расширяет "Vehicle" и реализует 
его абстрактные методы. При создании объекта "Motorcycle",
число колес устанавливается в 2, а скорость в 0. В методе 
"testDrive()" скорость устанавливается на 75, а в методе 
"park()" - обратно в 0.

## Решение

Решение реализовано в папках "Lesson2" 
внутри каталогов /src/main/java/ и /srs/test/java.
