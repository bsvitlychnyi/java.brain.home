package labs.lab009;

public class Pizza {
    private Circle basis;
    private String composition;
    private String name;
    private double cost;

    public Pizza(String name, String composition, double cost, double diameter){
        this.name = name;
        this.composition = composition;
        this.cost = cost;
        this.basis = new Circle(diameter/2);
    }

    @Override
    public String toString() {
        return "Пицца " + name +
                " - Размеры : " + "Радиус "+(basis.getRadius()*2)+ "см"+
                ", Состав : " + composition +
                ", Цена : " + cost + "грн";
    }

    public Circle getBasis() {
        return basis;
    }

    public void setBasis(Circle basis) {
        this.basis = basis;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
