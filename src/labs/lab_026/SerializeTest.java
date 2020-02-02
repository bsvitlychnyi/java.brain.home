package labs.lab_026;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class SerializeTest {
    public static void main(String[] args){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("CreditCard.dat")))
        {
            CreditCard p = new CreditCard();
            oos.writeObject(p);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
