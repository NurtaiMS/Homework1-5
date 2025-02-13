import java.util.Scanner; //Задача 3: Обработка ввода нечисловых данных
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите число: ");
            int num = scanner.nextInt();

            double result = 100.0 / num;
            System.out.println("Результат деления: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено нечисловое значение!");

        } finally {
            scanner.close();
        }
    }
}
