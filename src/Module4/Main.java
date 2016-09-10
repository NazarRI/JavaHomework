package Module4;
public class Main {

    public static void main(String[] args) {
        BankSystemImpl bsi = new BankSystemImpl();
        USBank usBank1 = new USBank(1, "us", Currency.EUR, 1, 500, 100, 1000000);
        USBank usBank2 = new USBank(2, "eu", Currency.EUR, 2, 510, 101, 1111111);
        EUBank euBank1 = new EUBank(3, "us", Currency.USD, 3, 520, 102, 2222222);
        EUBank euBank2 = new EUBank(4, "eu", Currency.EUR, 4, 530, 103, 3333333);
        ChinaBank chinaBank1 = new ChinaBank(5, "us", Currency.USD, 5, 540, 104, 4444444);
        ChinaBank chinaBank2 = new ChinaBank(6, "eu", Currency.EUR, 6, 550, 105, 5555555);

        User user1 = new User(11, "Bobi", 15000, 2, "Frr", 1000, chinaBank1 , 4);
        User user2 = new User(12, "Dobi", 10000, 3, "Bbb", 2000, chinaBank2 , 5);

         bsi.withdrawOfUser(user1, 100);
         bsi.fundUser(user1, 5000);
         bsi.transferMoney(user1, user2, 1000);
         bsi.paySalary(user1);







    }
}
