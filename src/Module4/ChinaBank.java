package Module4;


public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 100;
        else limit = 150;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int funding;
        if (getCurrency() == Currency.EUR) funding = 5000;
        else funding = 10000;
        return funding;
    }

    @Override
    double getMonthlyRate() {
        double rate;
        if (getCurrency() == Currency.USD) rate = 0.01;
        else rate = 0;
        return rate;
    }

    @Override
    double getCommision(int summ) {
        double commision = 0;
        if (getCurrency() == Currency.USD) {
            if (summ < 1000) commision = 0.03;
            else commision = 0.05;
            if (getCurrency() == Currency.EUR) {
                if (summ < 1000) commision = 0.10;
                else commision = 0.11;
            }
        }
        return commision;
    }
}
