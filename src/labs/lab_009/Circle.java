package labs.lab_009;

public class Circle {
    private double radius;
    private String color;
    private double circumference;
    private double area;

    public Circle(double radius){
        this.radius = radius;
        this.area = Math.PI * (this.radius * this.radius);
        this.circumference = Math.PI * (this.radius * 2);
    }

    public Circle(String color, double radius){
        this.radius = radius;
        this.color = color;
        this.area = Math.PI * (this.radius * this.radius);
        this.circumference = Math.PI * (this.radius * 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
