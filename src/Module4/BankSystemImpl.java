package Module4;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        if(user.getBank().getLimitOfWithdrawal() >= amount) {
            double balance = user.getBalance() - amount;
            double comission = user.getBank().getCommission(amount);
            System.out.println(balance - comission + " " + comission);
        }
        else {
            System.out.println("Лимит превышен");
        }

        double rate = user.getBank().getMonthlyRate() * user.getBalance();
        double reteBalance = user.getBalance() - rate;

    }

    @Override
    public void fundUser(User user, int amount) {
        if(user.getBank().getLimitOfFunding() >= amount){
           double b = user.getBalance() + amount;
            System.out.println(b);
        }
        else{
            System.out.println("Лимит пополнения превышен");
        }

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double a, b;
        if(fromUser.getBalance() >= amount){
            a = fromUser.getBalance() - amount;
            b = toUser.getBalance() + amount;
            System.out.println(a + " " + b);
        }

    }

    @Override
    public void paySalary(User user) {
        System.out.println(user.getBalance() + user.getSalary());
    }

}