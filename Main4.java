public class Main { //Задача 4: Проброс исключений

    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль невозможно!");
        }
    }

    public static int divideNumbers(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return num1 / num2;
    }
}
