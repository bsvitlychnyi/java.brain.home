package Roulette;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //Добавь уровни сложности. Первый уровень угадать число от 1 до 3. Второй от 1 до 10. Третий от 1 до 100.
    //Задай количество жизней. Возможность делать ставку на победу.
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum; // тут будем хранить загаданное число
        int userNum; // вариант ответа игрока
        int coins = 100; // коины игрока
        int rate; //ставка

        System.out.println("Добро пожаловать в игру! Рулетка проста - ставка на четное или нечетное, удачи");

        // Общий цикл
        while(true){
            rate = getRate(coins);
            userNum = getNumber();

            randomNum = r.nextInt(50)+1;
            System.out.println("На рулетке выпало "+randomNum);
            if (((randomNum%2)==0 && userNum == 1) || ((randomNum%2)!=0 && userNum == 2)){
                System.out.println("Победа");
                System.out.println("Вы выиграли " + rate*2 + " коинов");
                coins += rate;
                System.out.println("У вас " + coins + " коинов");
            }else{
                System.out.println("Не победа");
                System.out.println("Вы проиграли " + rate + " коинов");
                coins -= rate;
                System.out.println("У вас " + coins + " коинов");
            }
        }
    }

    // Метод принимающий ставку
    private static int getRate(int coins){

        int rate;
        System.out.println("Какая будет ставка (у вас "+ coins +" коинов)?");
        while (true){
            try{
                Scanner scan = new Scanner(System.in);
                rate = scan.nextInt();
                if (rate > coins || rate < 1){
                    System.out.println("Недопустимая ставка, попробуйте еще раз (у вас "+ coins +" коинов)");
                    continue;
                }
            }catch (InputMismatchException e){
                System.out.println("Похоже вы ввели не число, попробуйте еще раз");
                continue;
            }
            System.out.println("Ставка сделана!\n");
            break;

        }
        return rate;
    }

    // Метод принимающий число пользователя
    private static int getNumber(){
        int userNum;
        System.out.println("Ставите на \n" +
                "1 - четное\n" +
                "2 - нечетное");
        while (true){
            try {
                Scanner scan = new Scanner(System.in);
                userNum = scan.nextInt();

                if (userNum > 2 || userNum < 1){
                    System.out.println("Недопустимая ставка, попробуйте еще раз");
                    continue;
                }

            }catch (InputMismatchException e){
            System.out.println("Похоже вы ввели не число, попробуйте еще раз");
            continue;
            }
            System.out.println("Удачи!\n");
            break;
        }
        return userNum;
    }

}