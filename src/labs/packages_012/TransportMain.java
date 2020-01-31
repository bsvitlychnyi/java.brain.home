package labs.packages_012;

import labs.packages_012.transport.Passport;

public class TransportMain {
    public static void main(String[] args) {
        Passport passport = new Passport("Иван Иванов", "BMW", "525");
        System.out.println(passport);
        passport = passport.changeOwner("Петр Петров");
        System.out.println(passport);
    }
}
