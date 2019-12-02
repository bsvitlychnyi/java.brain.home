package internetShop;

public class Refrigerator extends BaseEntity {
    private int volume;

    public Refrigerator(String brand, String model, String color, double price, int volume) {
        super(brand, model, color, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return getBrand() + " за " + getPrice();
    }

    public void info(){
        System.out.println("Холодильник: \nБренд: "+ getBrand()+"\n"+
                "Модель: "+getModel()+"\n"+
                "Цвет: "+getColor()+"\n"+
                "Объем: "+getVolume()+"\n"+
                "Цена: "+getPrice()+"\n"+
                "Для возврата нажмите 0");
    }
}

