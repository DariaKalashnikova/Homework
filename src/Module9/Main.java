package Module9;


import Module7.MethodsUsed;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(500, "Fifa", "Choo", "Shanghai", 8000);
        User user2 = new User(25, "Ruth", "Galbani", "Mexico", 500);
        User user3 = new User(7, "Lima", "Sol", "Denver", 7500);
        User user4 = new User(88, "John", "Steel", "NY", 90000);
        User user5 = new User(5, "Helen", "Kawaii", "Schervurd", 85461);
        User user6 = new User(9, "Kowai", "Hewalona", "Maui", 55448);
        User user7 = new User(99, "Derrick", "Strong", "Highland", 98400);
        User user8 = new User(77, "Francheska", "Cotti", "Venice", 6000);
        User user9 = new User(10, "Dolly", "Kim", "Chicago", 10000);
        User user10 = new User(2, "Thor", "Odinov", "Valhalla", 10005230);

        List<Order> orders = new ArrayList<>(11);
        orders.add(new Order(15, 200, Currency.USD, "Food", "BILLA", user1));
        orders.add(new Order(74, 150, Currency.UAH, "Dwarf", "Store", user2));
        orders.add(new Order(14, 800, Currency.USD, "Fig", "Furshet", user3));
        orders.add(new Order(1, 5000, Currency.UAH, "Car", "Toystore", user4));
        orders.add(new Order(23, 309, Currency.UAH, "Shovel", "AgriWorld", user5));
        orders.add(new Order(22, 10, Currency.USD, "Lollipop", "Candy", user6));
        orders.add(new Order(19, 203, Currency.USD, "Pot", "HighSmile", user7));
        orders.add(new Order(33, 650, Currency.USD, "Pigeon", "Petstore", user8));
        orders.add(new Order(51, 30, Currency.UAH, "Cheese", "MilkFarm", user9));
        orders.add(new Order(9, 700, Currency.USD, "TorqueTester", "Miller", user10));
        orders.add(new Order(19, 203, Currency.USD, "Pot", "HighSmile", user7));

        Comparator<Order> comparatorPrice = (o1, o2) ->
                Integer.compare(o2.getPrice(), o1.getPrice());


        Comparator<Order> comparatorPriceAndCity = (o1, o2) -> {
            int result = Integer.compare(o1.getPrice(), o2.getPrice());
            if (result !=0){
                return result;
            }return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        };

        Comparator<Order> comparatorItemShopIdAndCity = (o1, o2) -> {
            int result = o1.getItemName().compareTo(o2.getItemName());
            if (result !=0){
                return result;
            }result = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            if (result !=0){
                return result;
            }return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        };

        orders = orders.stream().distinct().collect(Collectors.toList());
        System.out.println(orders);

        Predicate<Order> predicate = i -> i.getPrice()<1500;
        List<Order> orderList = orders.stream().filter(predicate).collect(Collectors.toList());

        boolean isContain = orders.stream().anyMatch(o -> (o.getUser().getLastName().equals("Petrov")));

        List<Order> listWithoutUsd = orders.stream().filter(o -> !o.getCurrency().equals(Currency.USD)).collect(Collectors.toList());

        orders.sort(comparatorPrice);
        System.out.println(orders);
        orders.sort(comparatorPriceAndCity);
        System.out.println(orders);
        orders.sort(comparatorItemShopIdAndCity);
        System.out.println(orders);
        System.out.println(orderList);
        System.out.println(isContain);
        System.out.println(listWithoutUsd);;
        System.out.println(separateList(orders, i -> i.getUser().getCity()));


    }

    private static <T> Map<T, List<Order>> separateList (List<Order> orders, Function<Order, T> orderTFunction){
        return orders.stream().collect(Collectors.groupingBy(orderTFunction));
    }
}
