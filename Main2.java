import java.util.Scanner; //Задача 2: Работа с массивом

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите индекс элемента массива: ");
            int i = scanner.nextInt();

            System.out.println("Элемент массива: " + array[i]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс выходит за пределы массива!");

        } finally {
            scanner.close();
        }
    }
}
