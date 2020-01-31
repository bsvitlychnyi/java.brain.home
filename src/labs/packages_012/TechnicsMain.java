package labs.packages_012;

import labs.packages_012.technics.Passport;
import labs.packages_012.technics.PassportUtil;

import java.util.Date;

public class TechnicsMain {
    public static void main(String[] args) {
        Passport passport = new Passport("Стиральная машина", "Samsung", new Date());
        System.out.println(passport);
        System.out.println(passport.getWarrantyStartDate().getTime());
        PassportUtil.warrantyReplace(passport);
        System.out.println(passport);
        System.out.println(passport.getWarrantyStartDate().getTime());
    }
}
