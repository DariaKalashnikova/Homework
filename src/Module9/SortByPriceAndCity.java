package Module9;


import java.util.Comparator;

public class SortByPriceAndCity implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        int compare = o1.compareTo(o2);
        if (compare != 0) {
            return compare;
        }
        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
    }
}
