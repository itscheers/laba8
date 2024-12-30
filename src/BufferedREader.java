import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

    public class BufferedREader {
        public static void main(String[] args) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"))) {
                String message = "Привіт, Аміго! Це дуже важливе повідомлення!";
                bufferedWriter.write(message, 0, 14); // Записываем первые 14 символов
                bufferedWriter.newLine();
                bufferedWriter.write(message, 15, 12); // Начинаем с 15 и длительность символов для следующего
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }


