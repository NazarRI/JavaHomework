package Module4;

public class ChinaBank extends Bank{

    ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWinthdraw;
        if(getCurrency() == Currency.USD){
            limitOfWinthdraw = 100;
        }
        else{
            limitOfWinthdraw = 150;
        }
        return limitOfWinthdraw;
    }

    @Override
    int getLimitOfFunding() {
        int limOfFund = 0;
        if(getCurrency() == Currency.EUR){
            limOfFund = 5000;
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
            rate = 0.01;
        }
        if(getCurrency() == Currency.EUR){
            rate = 0.00;
        }
        return rate;
    }

    @Override
    double getCommission( double summ) {
        double comission;
        if (getCurrency() == Currency.USD) {
            if (summ <= 1000) {
                comission = summ * 0.03;
            } else
                comission = summ * 0.05;
        } else {
            if (summ <= 1000)
                comission = summ * 0.10;
            else
                comission = summ * 0.11;
        }
        return comission;
    }


}
