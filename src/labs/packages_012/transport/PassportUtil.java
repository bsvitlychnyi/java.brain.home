package labs.packages_012.transport;

class PassportUtil {

    private PassportUtil(){
        // закрытый конструктор
    }

    static public Passport changeOwner(Passport passport, String owner){
        return new Passport(owner, passport.getMark(), passport.getModel());
    }
}
