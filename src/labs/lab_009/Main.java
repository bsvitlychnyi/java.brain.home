package labs.lab_009;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(6.0);
        System.out.println("Длина окружности - " + circle.getCircumference());
        System.out.println("Площадь - " + circle.getArea());
        System.out.println("Цвет - " + circle.getColor());
        System.out.println("Радиус - " + circle.getRadius());
        System.out.println();
        Circle circle2 = new Circle("red", 10.0);
        System.out.println("Длина окружности - " + circle2.getCircumference());
        System.out.println("Площадь - " + circle2.getArea());
        System.out.println("Цвет - " + circle2.getColor());
        System.out.println("Радиус - " + circle2.getRadius());
    }
}
