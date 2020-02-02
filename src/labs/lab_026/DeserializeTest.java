package labs.lab_026;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class DeserializeTest {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CreditCard.dat")))
        {
            CreditCard p=(CreditCard)ois.readObject(); // приведение к типу, т к по умолчанию Object
            System.out.println(String.valueOf(p));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
