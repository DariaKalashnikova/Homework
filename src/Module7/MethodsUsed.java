package Module7;


import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.*;

public class MethodsUsed {

    static List<Order> dublicates(List<Order> orders) {
        List<Order> resultList = new ArrayList<>();
        for (Order order : orders) {
            if (!resultList.contains(order)) {
                resultList.add(order);
            }
        }
        orders.clear();
        orders.addAll(resultList);
        return orders;
        // return new TreeSet<>(orders);
    }

    static List<Order> price(List<Order> orders) {
        List<Order> result = new ArrayList<>();
        Iterator<Order> price = orders.iterator();
        while (price.hasNext()) {
            Order order = price.next();
            if (order.getPrice() < 1500) {
                result.add(order);
            }
        }
        return result;
    }

    static Map<Currency, List<Order>> currency(List<Order> orders) {
        Map<Currency, List<Order>> result = new HashMap<>();
        for (Order order : orders) {
            Currency currency = order.getCurrency();
            if (result.containsKey(currency)) {
                result.get(currency).add(order);
            } else {
                List<Order> orderList = new ArrayList<>();
                orderList.add(order);
                result.put(currency, orderList);
            }

/*
            if (currency == Currency.UAH) {//круто, спасибо!!!
                if (result.containsKey(Currency.UAH)) {
                    result.get(Currency.UAH).add(order);
                } else {
                    List<Order> uah = new ArrayList<>();
                    uah.add(order);
                    result.put(Currency.UAH, uah);
                }
            } else if (order.getCurrency() == Currency.USD) {
                if (result.containsKey(Currency.USD)) {
                    result.get(Currency.USD).add(order);
                } else {
                    List<Order> usd = new ArrayList<>();
                    usd.add(order);
                    result.put(Currency.USD, usd);
                }
            }
*/
        }
        return result;
    }

    static Map<String, List<Order>> uniqueCities(List<Order> orders) {
        Map<String, List<Order>> result = new HashMap<>();
        for (Order order : orders) {
            String city = order.getUser().getCity();
            if (result.containsKey(city)) {
                result.get(city).add(order);
            } else {
                List<Order> orderList = new ArrayList<>();
                orderList.add(order);
                result.put(city, orderList);
            }
        }
        return result;
    }

    static boolean nameCheck(Set<Order> order) {
        Iterator<Order> name = order.iterator();
        while (name.hasNext()) {
            User user = name.next().getUser();
            if (user.getLastName().contains("Petrov")) {
                return true;
            }
        }
        return false;
    }

    static Order largestPrice(Set<Order> order) {
        Iterator<Order> largestPrice = order.iterator();
        return largestPrice.next();
    }

    static Set<Order> deleteUsd(Set<Order> orders) {
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getCurrency() == Currency.USD) {
                iterator.remove();
            }
        }
        return orders;
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

