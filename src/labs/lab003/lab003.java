package labs.lab003;

public class lab003 {
    public static void main(String[] args) {
        // 1
        // Написать программу,где объявлены и проинициализированы все примитивные типы данных.
        // (byte, short, int, long, float, double, char, boolean)
        // Необходимо вывести на экран все значения этих переменных.

        byte b = 1;
        short sh= 1;
        int i = 1;
        long l = 1L;
        float f = 0.1f;
        double d = 0.1;
        char ch = 'f';
        boolean bool = false;
        System.out.println("Значение типа byte = " + b);
        System.out.println("Значение типа short = " + sh);
        System.out.println("Значение типа int = " + i);
        System.out.println("Значение типа long = " + l);
        System.out.println("Значение типа float = " + f);
        System.out.println("Значение типа double = " + d);
        System.out.println("Значение типа char = " + ch);
        System.out.println("Значение типа boolean = " + bool);


        // 2
        // Применить на практике возможные преобразования без потери точности.

        short newSh = b;
        int newInt = newSh;
        long newLong = newInt;
        double newDouble = newInt;
        float newFloat = newSh;
        double newDouble2 = newFloat;
        int newInt2 = ch;


        // 3
        // Применить на практике автоматическое преобразование,но с потерей точности: int -> float.

        int maxVal = 2147483647;
        float newFloat2 = maxVal;
        System.out.println(maxVal);
        System.out.println(newFloat2);

        // 4
        // Проверить работу переполнения мантиссы числа в java.

        byte max = 127;
        max++;
        System.out.println(max);


        // 5
        // Написать тернарную операцию,которая определяет четность числа и формирует соответствующую строку, которая выводится на экран
        int num = 11;
        System.out.println(num % 2 == 0? num+" -> четное": num+" -> не четное");
    }
}
