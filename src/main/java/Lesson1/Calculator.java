package Lesson1;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    /*
    Задание 1. ** В классе Calculator создайте метод calculateDiscount,
    который принимает сумму покупки и процент скидки и возвращает сумму
    с учетом скидки. Ваша задача - проверить этот метод с использованием
    библиотеки AssertJ. Если метод calculateDiscount получает недопустимые
    аргументы, он должен выбрасывать исключение ArithmeticException.
    Не забудьте написать тесты для проверки этого поведения.
     */

    /*
    Тесты выполнены с использованием JUnit.
    Тип исключения принят IllegalArgumentException вместо ArithmeticException.
     */


    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        if (discountAmount < 0) {
            throw  new IllegalArgumentException(
                    "Argument \"discountAmount\" must be greater than or equal to zero."
            );
        }
        if (discountAmount > 100) {
            throw new IllegalArgumentException(
                    "Argument \"discountAmount\" must be less than one hundred."
            );
        }
        if (purchaseAmount < 0) {
            throw new IllegalArgumentException(
                    "Argument \"purchaseAmount\" must be greater than or equal to zero."
            );
        }
        // Метод должен возвращать сумму покупки со скидкой
        return purchaseAmount * (100-discountAmount) / 100.0;
    }
}
