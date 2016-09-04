package Module3.Task4;


public class Main {

    public static void main(String[] args) {

        User Transformers = new User("Bumblebee", 235800, 58, "Autobots", 15000, "USD");
        Transformers.paySalary();
        Transformers.withdraw(8200);
        Transformers.companyNameLength();
        Transformers.monthIncreaser(12);
    }

}
