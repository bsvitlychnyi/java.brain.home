package labs.packages_012.technics;

import java.util.Date;

public class Passport {
    private String section;
    private String brand;
    private Date warrantyStartDate;

    public Passport() {
    }

    public Passport(String section, String brand, Date warrantyStartDate) {
        this.section = section;
        this.brand = brand;
        this.warrantyStartDate = warrantyStartDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "section='" + section + '\'' +
                ", brand='" + brand + '\'' +
                ", warrantyStartDate=" + warrantyStartDate +
                '}';
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getWarrantyStartDate() {
        return warrantyStartDate;
    }

    public void setWarrantyStartDate(Date warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }
}
