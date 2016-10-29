package Module9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        List<Order> order = new ArrayList<>(11);
        order.add(new Order(15, 200, Currency.USD, "Food", "BILLA", user1));
        order.add(new Order(74, 150, Currency.UAH, "Dwarf", "Store", user2));
        order.add(new Order(14, 800, Currency.USD, "Fig", "Furshet", user3));
        order.add(new Order(1, 5000, Currency.UAH, "Car", "Toystore", user4));
        order.add(new Order(23, 309, Currency.UAH, "Shovel", "AgriWorld", user5));
        order.add(new Order(22, 10, Currency.USD, "Lollipop", "Candy", user6));
        order.add(new Order(19, 203, Currency.USD, "Pot", "HighSmile", user7));
        order.add(new Order(33, 650, Currency.USD, "Pigeon", "Petstore", user8));
        order.add(new Order(51, 30, Currency.UAH, "Cheese", "MilkFarm", user9));
        order.add(new Order(9, 700, Currency.USD, "TorqueTester", "Miller", user10));
        order.add(new Order(19, 203, Currency.USD, "Pot", "HighSmile", user7));

        Collections.sort(order, (o1, o2) -> o2.compareTo(o1));
        System.out.println(order);

        System.out.println(new SortByPriceAndCity());
    }
}
