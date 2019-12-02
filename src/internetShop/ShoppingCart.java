package internetShop;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList cart= new ArrayList();

    public void add(BaseEntity item){
        this.cart.add(item);
    }

    public void dell(int index){
        this.cart.remove(index);
    }

    public void seeAll(){
        if (this.cart.size() == 0){
            System.out.println("В корзине пусто");
            System.out.println("Для возврата в гланое меню введите 0");
        }else{
            for (int i = 0; i < this.cart.size(); i++){
                System.out.println((i+1)+")"+ this.cart.get(i));
            }
            System.out.println("Для удаления из корзины введите номер товара\nДля возврата в гланое меню введите 0");
        }

    }

    @Override
    public String toString() {
        return "Ваша корзина покупок:\n" +
                "cart=" + cart +
                '}';
    }
}
