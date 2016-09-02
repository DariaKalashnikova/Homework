package Module2;


public class Assignment4 {
    public static void main(String[] args) {
        String[] ownerNames = {"Bob", "Patrik", "Sqidward", "Krabs", "Sandy"};
        int[] balances = {350, 500, 700, 10000, 5000};

        String ownerName = "Sqidward";
        double refill = 250;

        fund(ownerNames, ownerName, balances, refill);
    }

    static void fund(String ownerNames[], String ownerName, int balances[], double refill) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                balances[i] = (int) (balances[i] + refill);
                System.out.println(ownerName + " " + balances[i]);
            }
        }
    }
}




