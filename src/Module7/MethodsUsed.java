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

    static void currency(List<Order> orders) {
        List<Order> uah = new ArrayList<>();
        List<Order> usd = new ArrayList<>();
        for (Order order : orders) {
            if (order.getCurrency() == Currency.UAH) {
                uah.add(order);
            } else {
                usd.add(order);
            }
        }
        System.out.println(uah);
        System.out.println(usd);
    }

    static List<Order> uniqueCities(List<Order> order) {
        new ArrayList<Order>();
        for (int i = 0; i < order.size(); i++) {
            for (int k = 0; k < order.size() - 1; k++) {
                if (order.get(i).getUser().city.equals(order.get(k).getUser().city)) {
                    order.remove(order.get(i));
                    new ArrayList<Order>().add(order.get(k));
                } else {
                    new ArrayList<Order>().add(order.get(i));
                    new ArrayList<Order>().add(order.get(k));
                    i++;
                    k++;
                }
            }
        }
        return null;
    }

    static void nameCheck(Set<Order> order) {
        Iterator<Order> name = order.iterator();
        while (name.hasNext()) {
            if (name.next().getUser().lastName.contains("Petrov")) {
                System.out.println("true");
            }
        }
    }

    static Order largestPrice(Set<Order> order) {
        Iterator<Order> largestPrice = order.iterator();
        return largestPrice.next();
    }

    static Set<Order> deleteUsd(Set<Order> order, Currency currency) {
        Iterator<Order> deleteUsd = order.iterator();
        while (deleteUsd.hasNext()) {
            if (deleteUsd.next().getCurrency() == currency) {
                deleteUsd.remove();
            }

        }
        return order;
    }
}

   /* static List<Order> currency(List<Order> order) {
        List<Order> uah = new ArrayList<>();
        List<Order> usd = new ArrayList<>();
        Iterator<Order> currency = order.iterator();
        while (currency.hasNext()){
            if (currency.next().getCurrency() == Currency.UAH){
                uah.add(currency.next());} else {
                usd.add(currency.next());
            }
        }
       /*for(int i=0; i< order.size(); i++){
           if (currency.next().getCurrency() == Currency.UAH){
               uah.add(order.get(i));
           }else {
               usd.add(order.get(i));
               System.out.println(uah);
               System.out.println(usd);
           }
       }
        return null;*/
//return null;
//}

