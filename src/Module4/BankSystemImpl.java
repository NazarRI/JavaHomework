package Module4;

import java.util.Date;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        double balance, comission;
        if(user.getBank().getLimitOfWithdrawal() >= amount) {
            comission = user.getBank().getCommission(amount);
            user.setBalance(balance = user.getBalance() - amount -comission);
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
            user.setBalance(b = user.getBalance() + amount);
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
            fromUser.setBalance(a = fromUser.getBalance() - amount);
            toUser.setBalance(b = toUser.getBalance() + amount);
            System.out.println("transferMoney " + a + " " + b);

        }

    }

    @Override
    public void paySalary(User user) {
        double b;
        user.setBalance(b = user.getBalance() + user.getSalary());
        System.out.println("paySalary " + b);
    }
}
