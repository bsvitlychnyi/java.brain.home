package labs.packages_012;

import labs.packages_012.citizen.Passport;
import static labs.packages_012.citizen.PassportUtil.marriageRegistrate;

public class CitizenMain {
    public static void main(String[] args) {
        Passport passportMan = new Passport("СЮ154575", "Иван", "Иванов");
        Passport passportWoman = new Passport("КП326598", "Марина", "Петрова");
        System.out.println(passportMan);
        System.out.println(passportWoman);
        marriageRegistrate(passportMan, passportWoman);
        System.out.println(passportMan);
        System.out.println(passportWoman);
    }
}
