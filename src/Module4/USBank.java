package Module4;




public class USBank extends Bank {

    USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);

    }

    BankSystemImpl ob1;

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWinthdraw;
        if (getCurrency() == Currency.USD) {
            limitOfWinthdraw = 1000;
        } else {
            limitOfWinthdraw = 1200;
        }
        return limitOfWinthdraw;
    }

    @Override
    int getLimitOfFunding() {
        int getLimitOfFund = 0;
        if (getCurrency() == Currency.EUR) {
            getLimitOfFund = 10000;
        } else {
            getLimitOfFund = Integer.MAX_VALUE;
        }
        return getLimitOfFund;
    }

    @Override
    double getMonthlyRate() {
        double rate = 0;
        if (getCurrency() == Currency.USD) {
            rate = 0.00;
        }
        if (getCurrency() == Currency.EUR) {
            rate = 0.01;
        }

        return rate;
    }

    @Override
    double getCommission(double summ) {
        double comission;
        if (getCurrency() == Currency.USD) {
            if (summ <= 1000) {
                comission = summ * 0.05;
            } else
                comission = summ * 0.07;
        } else {
            if (summ <= 1000)
                comission = summ * 0.06;
            else
                comission = summ * 0.08;
        }

            return comission;
        }


}

