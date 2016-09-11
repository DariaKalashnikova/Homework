package Module4;


public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 1000;
        else limit = 1200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int funding = 0;
        if (getCurrency() == Currency.EUR) {
            funding = 10000;
        } else funding = Integer.MAX_VALUE;
        return funding;
    }

    @Override
    double getMonthlyRate() {
        double rate;
        if (getCurrency() == Currency.USD) rate = 0.01;
        else rate = 0.02;
        return rate;
    }

    @Override
    double getCommision(int summ) {
        double commision = 0;
        if (getCurrency() == Currency.USD) {
            if (summ < 1000) commision = 0.05;
            else commision = 0.07;
        } else {
            if (getCurrency() == Currency.EUR) {
                if (summ < 1000) commision = 0.06;
                else commision = 0.08;
            }
        }
        return commision;
    }
}
