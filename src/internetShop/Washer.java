package internetShop;

public class Washer extends BaseEntity {
    private int maxLoad;
    private int spinSpeed;
    private int programm;

    public Washer(String brand, String model, String color, double price, int maxLoad, int spinSpeed, int programm) {
        super(brand, model, color, price);
        this.maxLoad = maxLoad;
        this.spinSpeed = spinSpeed;
        this.programm = programm;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    public int getProgramm() {
        return programm;
    }

    public void setProgramm(int programm) {
        this.programm = programm;
    }

    public void info(){
        System.out.println("Стиралка: \nБренд: "+ getBrand()+"\n"+
                "Модель: "+getModel()+"\n"+
                "Цвет: "+getColor()+"\n"+
                "Макс загрузка: "+getMaxLoad()+"\n"+
                "Обороты: "+getSpinSpeed()+"\n"+
                "Колл прогррамм: "+getProgramm()+"\n"+
                "Цена: "+getPrice()+"\n"+
                "Для добавления в козину нажмите 9"+"\n"+
                "Для возврата нажмите 0");
    }

    @Override
    public String toString(){
        return "Стиралка "+ getBrand()+", модель: "+getModel()+", цвет: "+getColor()+", макс загрузка: "+getMaxLoad()+", обороты: "+getSpinSpeed()+", колл прогррамм: "+getProgramm()+", цена: "+getPrice();
    }

}


