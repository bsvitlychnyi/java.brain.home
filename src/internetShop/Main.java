package internetShop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в интернет - магазин: Интер - техника");

        Scanner scanner = new Scanner(System.in);
        int userAnsw;
        int menu = -1;
        int itemNum = -1;
        ShoppingCart cart = new ShoppingCart();

        BaseEntity[][] menuArr = new BaseEntity[3][4];

        menuArr[0][0] = new Refrigerator("LG", "kg458ay", "Silver", 5406.15, 50);
        menuArr[0][1] = new Refrigerator("Samsung", "sp6eqw3", "Black", 10_256.50, 60);
        menuArr[0][2] = new Refrigerator("Nord", "259r", "White", 3599.25,45);
        menuArr[0][3] = new Refrigerator("Whirpool", "B67g61W", "Silver", 14_170.00, 70);
        menuArr[1][0] = new Washer("Whirpool", "45iryt", "White", 12_351.25, 6, 1000, 12);
        menuArr[1][1] = new Washer("Zanussi", "NWyu675", "Silver", 10_550.00, 6, 1000, 8);
        menuArr[1][2] = new Washer("LG", "98rutw", "White", 15_781.85, 7, 1200, 14);
        menuArr[1][3] = new Washer("Samsung", "Sam87", "White", 9_351.25, 5, 1200, 10);
        menuArr[2][0] = new Microwave("Samsung", "374dfft", "Black", 2399.00, 23, 800);
        menuArr[2][1] = new Microwave("LG", "689dsa", "Silver", 1599.00, 20, 600);
        menuArr[2][2] = new Microwave("Beko", "eddf688", "Silver", 3399.00, 27, 1000);
        menuArr[2][3] = new Microwave("Whirpool", "374dfft", "White", 3799.00, 30, 1200);

        while(true){
            if (menu < 0 ){
                menu = selectMenu();
                if (menu == -1){
                    break;
                }else if (menu == 8){
                    cart(cart);
                    menu = -1;
                    continue;
                }
            }

            if (itemNum < 0){
                for (int i = 0; i < menuArr[menu].length; i++) {
                    System.out.println(i+1+") "+ menuArr[menu][i].shortInfo());
                }
                System.out.println("Для выхода в главное меню нажмите 0");
                itemNum = selectItem();
                if (itemNum == -1){
                    menu = -1;
                    continue;
                }
                menuArr[menu][itemNum].info();
            }

            userAnsw = scanner.nextInt();
            if (userAnsw == 0){
                itemNum = -1;
            }else if (userAnsw == 9){
                cart.add(menuArr[menu][itemNum]);
                itemNum = -1;
                System.out.println("Добавлено");
            }
        }
    }

    private static int selectMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Каталог товаров: " +
                "\n1" + ". Холодильники" +
                "\n2" + ". Стиральные машины" +
                "\n3" + ". Микроволновые печи");
        System.out.println("Для просмотра корзины нажмите 9\nДля выхода нажмите 0");
        int userAns = scanner.nextInt();
        if (userAns == 0){
            return -1;
        }else {
            return userAns - 1;
        }
    }

    private static int selectItem(){
        Scanner scanner = new Scanner(System.in);
        int userAns = scanner.nextInt();
        if (userAns == 0){
            return -1;
        }else {
            return userAns - 1;
        }
    }

    private static void cart(ShoppingCart cart){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("В вашей корзине:");
            cart.seeAll();
            int dellNum = scanner.nextInt();
            if (dellNum == 0){
                break;
            }else {
                cart.dell(dellNum-1);
            }

        }

    }
}
