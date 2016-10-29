package Module7;


import java.util.Comparator;

public class ItemNameAndShopIdAndCity implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        int compare = o1.getItemName().compareTo(o2.getItemName());
        if (compare != 0) {
            return compare;
        }
        compare = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
        if (compare != 0) {
            return compare;
        }
        return o1.getUser().getCity().compareTo(o2.getUser().getCity());

    }
}
