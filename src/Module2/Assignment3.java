package Module2;


public class Assignment3 {

    public static void main(String[] args) {
        String[] ownerNames = {"Bob", "Patrik", "Sqidward", "Krabs", "Sandy"};
        int[] balances = {350, 500, 700, 10000, 5000};
        double commision = 0.05;

        String ownerName = "Bob";
        double withdraw = 350;

        String ownerName1 = "Sandy";
        double withdraw1 = 800;

        transaction(ownerNames, ownerName, balances, withdraw, commision);
        transaction(ownerNames, ownerName1, balances, withdraw1, commision);

    }

    static void transaction(String ownerNames[], String ownerName, int balances[], double withdraw, double commision) {

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                if (balances[i] - withdraw - commision > 0) {
                    balances[i] = (int) (balances[i] - withdraw - withdraw*commision);
                    System.out.println(ownerNames[i] + " " + withdraw + " balance left " + balances[i]);
                } else {
                    System.out.println(ownerNames[i] + " No ");
                }
            }
        }
    }
}












