import java.io.FileReader; //Задача 5: Логирование ошибок
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        String filePath = "example.txt";
        try {
            FileReader fileReader = new FileReader(filePath);
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + filePath);
            logError(e);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + filePath);
            logError(e);
        }
    }

    private static void logError(Exception e) {
        try (FileWriter fileWriter = new FileWriter("error.log", true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println("Ошибка: " + e.getMessage());
            e.printStackTrace(printWriter);
        } catch (IOException logException) {
            System.err.println("Не удалось записать в лог-файл.");
            logException.printStackTrace();
        }
    }
}
