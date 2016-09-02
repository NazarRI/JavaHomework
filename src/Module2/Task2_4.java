package Module2;

public class Task2_4 {
    private static int[] balances = {1200, 250, 2000, 500, 3200};
    private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static double fundBalance(String ownername, double fund) {
        double balance = 0;
        for (int i = 0; i < ownerNames.length; i++) {
           if(ownerNames[i] == ownername) {
              balance = balances[i] + fund;
           }
       }
        return balance;
    }

    public static void main(String[] args) {
        String ownerName = "Ann";
        double fund = 100;

        double res = fundBalance(ownerName ,fund);
        System.out.println(ownerName + " " + res);
    }
}
