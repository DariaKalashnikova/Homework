package Module2;


public class Assignment3 {

    static int[] balances = {680, 250, 995, 845, 312};
    static String[] ownerNames = {"John", "Jack", "Jill", "Patrik", "Bob"};
    double commision = 0.05;

    static double balance(double withdraw, String[] ownerNames, double commision) {
        int index = 0;
        for (int i = 0; i < ownerNames.length; i++)
            if (ownerNames.equals(ownerNames[i])) {
                index = i;
            }
        int balance = balances[index];
        return balance - withdraw - withdraw * commision;
    }

    public static void main(String[] args) {

        String ownerName = "Patrik";
        double withdraw = 500;

        System.out.println(ownerName + balances);
    }
}




