package Behavioral.Strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cristiano on 07/02/17.
 */
public class ShoppingCart {

    //List of items
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    /**
     * Notice that payment method of shopping cart requires payment algorithm
     * as argument and doesn’t store it anywhere as instance variable.
     *
     * @param paymentMethod
     */
    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }

}
