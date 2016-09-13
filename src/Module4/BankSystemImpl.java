package Module4;

import java.util.Date;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        double balance, comission;
        if(user.getBank().getLimitOfWithdrawal() >= amount) {
            comission = user.getBank().getCommission(amount);
            balance = user.getBalance() - amount -comission;
            user.setBalance(balance);
            System.out.println("withdrawOfUser " + balance + " "+ amount + " " + comission);
        }
        else {
            System.out.println("Лимит превышен");
        }
        System.out.println("MonthlyRate " + user.getBank().getMonthlyRate());

    }

    @Override
    public void fundUser(User user, int amount) {
        double b;
        if(user.getBank().getLimitOfFunding() >= amount){
            b = user.getBalance() + amount;
            user.setBalance(b);
            System.out.println("fundUser " +b);
        }
        else{
            System.out.println("Лимит пополнения превышен");
        }

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if(fromUser.getBalance() >= amount){
            double a, b;
            a = fromUser.getBalance() - amount;
            b = toUser.getBalance() + amount;
            fromUser.setBalance(a);
            toUser.setBalance(b);
            System.out.println("transferMoney " + a + " " + b);

        }

    }

    @Override
    public void paySalary(User user) {
        double b;
        b = user.getBalance() + user.getSalary();
        user.setBalance(b);
        System.out.println("paySalary " + b);
    }
}
