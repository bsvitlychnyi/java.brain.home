package labs.packages_012.transport;

public class Passport {
    private String ownerName;
    private String mark;
    private String model;

    public Passport() {
    }

    public Passport(String ownerName, String mark, String model) {
        this.ownerName = ownerName;
        this.mark = mark;
        this.model = model;
    }

    public Passport changeOwner(String owner){
        return changeOwner(this, owner);
    }

    Passport changeOwner(Passport passport, String owner){
        return new Passport(owner, passport.getMark(), passport.getModel());
    }

    @Override
    public String toString() {
        return "Passport{" +
                "ownerName='" + ownerName + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
