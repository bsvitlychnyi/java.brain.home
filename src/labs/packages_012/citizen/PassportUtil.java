package labs.packages_012.citizen;

public class PassportUtil {

    private PassportUtil(){
        // закрытый конструктор
    }

    static public void marriageRegistrate(Passport husband, Passport wife){
        husband.setSpouseId(wife.getId());
        wife.setSpouseId(husband.getId());
    }
}
