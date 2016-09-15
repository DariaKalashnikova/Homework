package Module3.task4;


public class Main {

    public static void main(String[] args) {

        User transformers = new User("Bumblebee", 235800, 58, "Autobots", 15000, "USD");
        transformers.paySalary();
        transformers.withdraw(8200);
        transformers.companyNameLength();
        transformers.monthIncreaser(12);
    }

}
