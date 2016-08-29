package Module2;

public class Task2_4 {
    public static int[] balances = {1200, 100, 2000, 500, 3200};

    static double fundBalance(String[] ownerName, double fund) {
        String ownN = ownerName[0];
        double fun = fund;
        double result;
        double bal;
        for (int i = 0; i < ownerName.length; i++) {
            ownN = ownerName[3];
        }
        bal = balances[3];
        result = bal + fun;
        System.out.print(ownN + " ");

        return result;
    }

    public static void main(String[] args) {

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int fund = 100;

        double res = fundBalance(ownerNames, fund);
        System.out.println(res);

    }
}
