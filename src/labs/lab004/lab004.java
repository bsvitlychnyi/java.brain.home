package labs.lab004;

public class lab004 {
    public static void main(String[] args) {
        // 1
        // Решить логическиевычисления:
        // a. true && false || true && !false
        // b. false || false || !true && false
        // c. !false&&(false || true && true)
        // d. 4 > 8 && !(7 == 0)
        // e. !(true && false || false && true)&&!(true && 4<=5)
        // Ответы
        // a -> true
        // b -> false
        // c -> true
        // d -> false
        // e -> false
        System.out.println("a -> " + (true && false || true && !false));
        System.out.println("b -> " + (false || false || !true && false));
        System.out.println("c -> " + (!false&&(false || true && true)));
        System.out.println("d -> " + (4 > 8 && !(7 == 0)));
        System.out.println("e -> " + (!(true && false || false && true)&&!(true && 4<=5)));
        System.out.println();

        // 2
        // Написать программу, которая выводит на экран (с новой строки) числа от 0 до 10 и возле каждого пишет четное это число или нечетное
        // Пример
        // 1 -> нечетное
        // 2 -> четноеи т д.

        for (int i = 0; i <= 10; i++) {
            System.out.println(i % 2 == 0 ? i + " -> четное": i + " -> не четное");
        }
        System.out.println();

        // 3
        // Написать программу, которая выводит информацию о дне неделе.
        // Например для понедельника –пятницы выводит сообщение “Это рабочий день”, а длясубботы и воскресенья выводит “Это выходной!”

        String day = "Sunday";
        switch (day) {
            case "Monday":
                System.out.println("это рабочий день");
                break;
            case "Tuesday":
                System.out.println("это рабочий день");
                break;
            case "Wednesday":
                System.out.println("это рабочий день");
                break;
            case "Thursday":
                System.out.println("это рабочий день");
                break;
            case "Friday":
                System.out.println("это рабочий день");
                break;
            case "Saturday":
                System.out.println("это выходной день");
                break;
            case "Sunday":
                System.out.println("это выходной день");
                break;
            default:
                System.out.println("это не день");
                break;
        }
        System.out.println();

        // 4
        // Написать программу, которая считает факториал числа и выводит промежуточные значения на экран.
        // Условие: если промежуточное значение >1000, завершить цикл предварительно написав в консоли “Достигнут максимально возможный результат”

        int res = 1;
        int num = 2;
        int lim = 1000;
        for (int i = 2; i <= num; i++) {
            res=res*i;
            if (res > lim){
                System.out.println("Достигнут лимит");
                break;
            }else if (i == num){
                System.out.println("Результат = " +  res);
            }else{
                System.out.println(res);
            }}
        System.out.println();

        // 5
        // Написать программу, которая выводит на экран каждое 3-е i-оезначение цикла.

        int step = 1;
        for (int i = 0; i < 15; i++) {
            if (step % 3 == 0){
                System.out.println(i);
            }
            step-=-1;
        }

    }
}
