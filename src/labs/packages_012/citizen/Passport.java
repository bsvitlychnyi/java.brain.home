package labs.packages_012.citizen;

public class Passport {
    private String Id;
    private String name;
    private String lastName;
    private String spouseId;

    public Passport() {
    }

    public Passport(String id, String name, String lastName) {
        Id = id;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", spouseId='" + spouseId + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getSpouseId() {
        return spouseId;
    }

    public void setSpouseId(String spouseId) {
        this.spouseId = spouseId;
    }
}
