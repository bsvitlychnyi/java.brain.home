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

    public void info(){
        System.out.println("Холодильник: \nБренд: "+ getBrand()+"\n"+
                "Модель: "+getModel()+"\n"+
                "Цвет: "+getColor()+"\n"+
                "Объем: "+getVolume()+"\n"+
                "Цена: "+getPrice()+"\n"+
                "Для добавления в козину нажмите 9"+"\n"+
                "Для возврата нажмите 0");
    }

    @Override
    public String toString(){
        return ("Холодильник "+ getBrand()+", модель: "+getModel()+", цвет: "+getColor()+", объем: "+getVolume()+", цена: "+getPrice());
    }
}

