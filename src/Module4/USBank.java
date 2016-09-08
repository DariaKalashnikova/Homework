package Module4;


import java.util.*;

public class USBank extends Bank{

    public USBank (long id, String bankCountry, java.util.Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital){
        super(id,bankCountry,currency,numberOfEmployees,avrSalaryOfEmployee,rating,totalCapital);
    }
    @Override
    int getLimitOfWithdrawal() {return 0;}

    @Override
    int getLimitOfFunding() {
        return 0;
    }

    @Override
    int getMonthlyRate() {
        return 0;
    }

    @Override
    int getCommision(int summ) {
        return 0;
    }
}
