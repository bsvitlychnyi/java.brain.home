package imgCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("files/img.jpg");
            fileOutputStream = new FileOutputStream("files/copied_img.jpg");
            int temp;
            long start = System.nanoTime();
            while ((temp = fileInputStream.read())!=-1){
                fileOutputStream.write(temp);
            }
            long finish = System.nanoTime();
            long timeConsumedMillis = finish - start;
            System.out.println("Файл скопирован");
            System.out.printf("Заняло времени %,9.3f ms\n", timeConsumedMillis/1_000_000.0);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("шото с файлом");
            e.printStackTrace();
        }
    }
}
