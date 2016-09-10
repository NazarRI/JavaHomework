package Module4;

public class EUBank extends Bank{

    EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWinthdraw;
        if(getCurrency() == Currency.USD){
            limitOfWinthdraw = 2000;
        }
        else{
            limitOfWinthdraw = 2200;
        }
        return limitOfWinthdraw;
    }

    @Override
    int getLimitOfFunding() {
        int limOfFund = 0;
        if(getCurrency() == Currency.EUR){
            limOfFund = 20000;
        }
        if(getCurrency() == Currency.USD){
            limOfFund = 10000;
        }

        return limOfFund;
    }

    @Override
    double getMonthlyRate() {
        double rate = 0;
        if(getCurrency() == Currency.USD){
            rate = 0.00;
        }
        if(getCurrency() == Currency.EUR){
            rate = 0.01;
        }

        return rate;
    }

    @Override
    double getCommission( double summ) {
        double comission;
        if (getCurrency() == Currency.USD) {
            if (summ <= 1000) {
                comission = summ * 0.05;
            } else
                comission = summ * 0.07;
        } else {
            if (summ <= 1000)
                comission = summ * 0.02;
            else
                comission = summ * 0.04;
        }

        return comission;
    }


}
