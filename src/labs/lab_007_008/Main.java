package labs.lab_007_008;

public class Main {
    public static void main(String[] args) {
        //lab 007
        // 1.1 Создать 3 классаспубличными полями, которыеописывают объекты из списка:Книга, Отделение почты, Клиент магазина, свой вариант.

        // 1.2 Константы.Дополнить классы константными значениями, полями класса(staticfinal). Поля должны иметь отношение к предметной области.

        // 1.3Создание экземпляровСоздать дополнительный класс, например Main, для проверки предыдущих шагов.
        // В этом классе создать mainметод, в котором создать экземпляры описанных ранее классов.

        // 1.4 Инициализацияполей объекта С помощью доступа к переменной, через «точку»у объекта класса, проинициализировать поля.

        // 1.5 Вывод информации о объекте.


        // 2.1 Поменять все модификаторы доступа у полей экземпляра класса на private.Попробовать запустить Mainкласс

        // 2.2 Сгенерировать во всехописанных классах методы getи set.

        // 2.3 Заменить работу с полями классачерез «точку», на работу через методы getи set

        // lab 008
        // 1.1 Дополнить классы нужными методами, для эмуляции действий просто выводить описание действия на экран

        // 1.2 Вызвать методы в тестовом классе (Main)

        // 1.3 Перегрузить метод водном из классов.Например, метод,который перелистывает на определенную страницуперегрузить методом,
        // который перелистывает на определенную главу

        // 1.4 Создать статический метод в любом из классов. Например, создать статический метод в классе «Отделение почты»,
        // который будет рассчитывать объемный вес посылки, в зависимости от переданных параметров


        Book newBook = new Book();
        // newBook.author = "Oreiro";
        // newBook.pageCount = 258;
        // newBook.title = "Как сдать лабораторные работы";
        newBook.setAuthor("Oreiro");
        newBook.setPageCount(258);
        newBook.setTitle("Как сдать лабораторные работы");
        newBook.goTo(2);
        newBook.goTo("Учим всю ночь");

        PostOffice newPostOffice = new PostOffice();
        // newPostOffice.address = "Portnova 34";
        // newPostOffice.workerCount = 15;
        newPostOffice.setAddress("Portnova 34");
        newPostOffice.setWorkerCount(15);
        newPostOffice.send(new int[] {1,2,3});
        System.out.println("Объемный вес посылки " + PostOffice.calculateVolumeWeight(50.0, 60.0, 40.0) + "кг");

        ShopCustomer newShopCustomer = new ShopCustomer();
        // newShopCustomer.discount = true;
        // newShopCustomer.name = "Просто Олег";
        newShopCustomer.setDiscount(true);
        newShopCustomer.setName("Просто Олег");
        newShopCustomer.addToCart("Картоха");
        System.out.println();


        System.out.println(newBook);
        System.out.println(newPostOffice);
        System.out.println(newShopCustomer);
    }
}
