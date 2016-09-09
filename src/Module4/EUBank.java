package Module4;


public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {

        int limit;
        if (getCurrency() == Currency.USD) limit = 2000;
        else limit = 2200;
        return limit;

    }

    @Override
    int getLimitOfFunding() {
        int funding;
        if (getCurrency() == Currency.EUR) funding = 20000;
        else funding = 10000;
        return funding;
    }

    @Override
    double getMonthlyRate() {
        double rate;
        if (getCurrency() == Currency.EUR) rate = 0.01;
        else rate = 0;
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
                if (summ < 1000) commision = 0.02;
                else commision = 0.04;
            }
        }
        return commision;
    }
}
