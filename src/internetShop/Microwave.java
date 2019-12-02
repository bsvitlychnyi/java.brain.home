package internetShop;

public class Microwave extends BaseEntity {
    private int volume;
    private int power;

    public Microwave(String brand, String model, String color, double price, int volume, int power) {
        super(brand, model, color, price);
        this.volume = volume;
        this.power = power;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


    public void info(){
        System.out.println("Микроволновка: \nБренд: "+ getBrand()+"\n"+
                "Модель: "+getModel()+"\n"+
                "Цвет: "+getColor()+"\n"+
                "Объем: "+getVolume()+"\n"+
                "Моща: "+getPower()+"\n"+
                "Цена: "+getPrice()+"\n"+
                "Для добавления в козину нажмите 9"+"\n"+
                "Для возврата нажмите 0");
    }

    @Override
    public String toString(){
        return ("Микроволновка: \nБренд: "+ getBrand()+", модель: "+getModel()+", цвет: "+getColor()+", объем: "+getVolume()+", моща: "+getPower()+", цена: "+getPrice());
    }
}

