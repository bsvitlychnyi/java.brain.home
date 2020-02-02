package labs.lab_026;

import java.io.Serializable;
import java.util.Date;


public class CreditCard implements Serializable {
    private String cardType;
    private String bankName;
    private long cardNumber;
    private  transient Date exp;
    private  transient int cvv;

    public CreditCard() {
        this.cardType = "Master";
        this.bankName = "OTP";
        this.cardNumber = 88005553535L;
        this.exp = new Date();
        this.cvv = 3298;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardType='" + cardType + '\'' +
                ", bankName='" + bankName + '\'' +
                ", cardNumber=" + cardNumber +
                ", exp=" + exp +
                ", cvv=" + cvv +
                '}';
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExp() {
        return exp;
    }

    public void setExp(Date exp) {
        this.exp = exp;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
