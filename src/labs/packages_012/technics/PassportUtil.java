package labs.packages_012.technics;
import java.util.Date;

public class PassportUtil {

    private PassportUtil(){
        // закрытый конструктор
    }

    static public void warrantyReplace(Passport passport){
        passport.setWarrantyStartDate(new Date());
    }
}
