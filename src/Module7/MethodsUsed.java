package Module7;

import java.util.*;

public class MethodsUsed {

    static Set<Order> dublicates(List<Order> order) {
        return new TreeSet<>(order);
    }

    static List<Order> price(List<Order> order) {
        Iterator<Order> price = order.iterator();
        while (price.hasNext()) {
            if (price.next().getPrice() < 1500) price.remove();
        }
        return order;
    }

    static List<Order> currency(List<Order> order) {
        Iterator<Order> currency = order.iterator();
        while (currency.hasNext()) {
            if (currency.next().getCurrency() == Currency.USD) continue;
        }
        return order;
    }
}
