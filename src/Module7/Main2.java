package Module7;


import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        User user1 = new User(13, "Jim", "Beam", "Chicago", 550000);
        User user2 = new User(3, "Jinna", "Sea", "Kiev", 150000);
        User user3 = new User(22, "Jack", "Jilliham", "Katowice",56000);
        User user4 = new User(55, "Fidel", "Kastro", "Cuba", 458777);
        User user5 = new User(7, "Nikolay", "Petrov", "Lviv", 55520);
        User user6 = new User(8, "Ginna", "Bridginna", "Neapol", 458700);
        User user7 = new User(1,"Lion", "Chocolate", "Nestle", 7853000);
        User user8 = new User(5, "Pinokio", "Wood", "Forest", 200000);
        User user9 = new User(11, "Finch", "Aberchrombie", "Nepal", 900800);
        User user10 = new User(8, "Donna", "Marricone", "Sizilia", 1000000);

        Set<Order> order = new TreeSet<>();
        order.add(new Order(20,250,Currency.UAH,"Barbie", "Antoshka", user1));
        order.add(new Order(20,250,Currency.UAH,"Barbie", "Antoshka", user1));
        order.add(new Order(21,200, Currency.USD, "Chocolate", "Factory", user2));
        order.add(new Order(22,150, Currency.USD,"Cookies", "Greenland", user3));
        order.add(new Order(23, 100, Currency.UAH, "Jewelery", "Blabla", user4));
        order.add(new Order(24,500, Currency.UAH, "Kimchi", "Klucka", user5));
        order.add(new Order(25, 450, Currency.UAH, "Coffee", "Zimbabve", user6));
        order.add(new Order(26, 400, Currency.USD, "Loschka", "Vilka", user7));
        order.add(new Order(27, 350, Currency.USD, "Chicken", "Meat", user8));
        order.add(new Order(28, 300, Currency.UAH, "Giraffe", "Toystore", user9));

        MethodsUsed.nameCheck(order);

        System.out.println(MethodsUsed.largestPrice(order));

        System.out.println(MethodsUsed.deleteUsd(order));
    }

}
