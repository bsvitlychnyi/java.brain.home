package Translator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> translator = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Это словарь с англ на рус и наоборот.");
        while(true){
            System.out.println("Что нужно делать?\n" +
                    "1 - перевести\n" +
                    "2 - дополнить словарь\n" +
                    "3 - показать весь словарь");
            int answ = scanner.nextInt();
            if (answ == 2){
                setInDict();
            }
            else if (answ == 1){
                System.out.println("Это словарь с англ на рус и наоборот. \n" +
                        "Для начала выберите язык:\n" +
                        "0 - для перевода с русского\n" +
                        "1 - для перевода с англ");
                translator = getDict(scanner.nextInt());
                translate(translator);
            }else if (answ == 3){
                translator = getDict(0);
                translator.entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
                System.out.println();
            }
        }


    }

    // Получить словарь
    private static Map getDict(int lang){
        Map<String, String> translator = new HashMap<>();
        try (Scanner scanner = new Scanner(new FileInputStream("files/translator.txt"))) {
            while (scanner.hasNextLine()) {
                String [] words = scanner.nextLine().split(" ");
                switch (lang) {
                    case  (0):  // Для перевода на английский
                        translator.put(words[0], words[1]);
                        break;
                    case (1):  // Для перевода на русский
                        translator.put(words[1], words[0]);
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return translator;
    }

    // Дополнить словарь
    private static void setInDict(){
        try (PrintWriter printWriter = new PrintWriter(new FileOutputStream("files/translator.txt", true))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите слово на английском");
            String engWord = scanner.nextLine();
            System.out.println("Введите слово на русском");
            String rusWord = scanner.nextLine();
            printWriter.println(rusWord+" "+engWord);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Переводчик
    private static void translate(Map translator){
        String userWord;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите слово для перевода или exit для выхода:");
            userWord = scanner.nextLine();
            if (userWord.equals("exit")){
                break;
            }
            if (translator.get(userWord) == null){
                System.out.println("В словаре не найдено такое слово, попробуйте другое");
                continue;
            }
            System.out.println("В переводе - " + translator.get(userWord));
        }
    }


}
