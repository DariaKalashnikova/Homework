package Module8;


import Module7.User;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        AbstractDaoImpl<User> abstractDao = new AbstractDaoImpl<>();

        List<User> genList = new ArrayList<>();

        User mlp = new User(1, "Pinkie", "Pie", "Ponyville", 500);
        User mlp2 = new User(2, "Apple", "Jack", "Sweet Apple Acres", 1000);
        User mlp3 = new User(3, "Rainbow", "Dash", "Cloudsdaile", 1500);
        User mlp4 = new User(4, "Twilight", "Sparkle", "Ponyville", 5000);
        User mlp5 = new User(5, "Rarity", "Generous", "Ponyville", 3000);
        User mlp6 = new User(6, "Flutter", "Shy", "Ponyville", 2500);
        User mlp7 = new User(7, "Spike", "Dragon", "Ponyville", 800);

        genList.add(mlp);
        genList.add(mlp2);
        genList.add(mlp3);
        genList.add(mlp4);
        genList.add(mlp5);
        genList.add(mlp6);
        genList.add(mlp7);


        abstractDao.save(mlp);
        abstractDao.save(mlp7);

        abstractDao.delete(mlp4);
        abstractDao.delete(mlp3);

        abstractDao.saveAll(genList);

        abstractDao.deleteAll(genList);

        abstractDao.getList();

    }
}
