import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String fileName = "nonexistent_file.txt";
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(fileName);
            System.out.println("Файл открыт успешно.");
        } catch (FileNotFoundException e) {
            logError(e);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                logError(e);
            }
        }
    }

    public static void logError(Exception e) {
        try (FileWriter logWriter = new FileWriter("error.log", true)) {
            logWriter.write(new Date() + " - Ошибка: " + e.getMessage() + "\n");
            System.out.println("Ошибка записана в лог.");
        } catch (IOException ioException) {
            System.out.println("Не удалось записать ошибку в лог.");
        }
    }
}
