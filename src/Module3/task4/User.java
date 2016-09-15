package Module3.task4;

public class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    private String getName() {
        return name;
    }

    private int getBalance() {
        return balance;
    }

    private int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    private String getCompanyName() {
        return companyName;
    }

    private int getSalary() {
        return salary;
    }

    private String getCurrency() {
        return currency;
    }

    private void setName() {
        this.name = name;
    }

    private void setBalance() {
        this.balance = balance;
    }

    private void setMonthsOfEmployment() {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    private void setCompanyName() {
        this.companyName = companyName;
    }

    private void setSalary() {
        this.salary = salary;
    }

    private void setCurrency() {
        this.currency = currency;
    }

    void paySalary() {
        int income = balance + salary;
        System.out.println("Paid salary is " + income);
    }

    void withdraw(int summ) {
        double commision = 0.05;
        double extraCommision = 0.10;

        if (summ < 1000) {
            System.out.println("Your balance after withdrawl " + (balance - balance * commision));
        } else {
            System.out.println("Your balance after withdrawl " + (balance - balance * extraCommision));
        }
    }

    void companyNameLength() {
        System.out.println("Company's name length is " + companyName.length());
    }

    void monthIncreaser(int addMonth) {
        int monthIncreaser = monthsOfEmployment + addMonth;
        System.out.println("By far you've worked in this company for " + monthIncreaser + " months");
    }

}
