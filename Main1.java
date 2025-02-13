import java.util.Scanner; //Задача 1: Обработка деления на ноль

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            if (num2 == 0) {
                throw new ArithmeticException("Ошибка: Деление на ноль невозможно!");
            }

            double result = num1 / num2;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
