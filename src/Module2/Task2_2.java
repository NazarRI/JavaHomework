package Module2;

public class Task2_2 {
    static double withdrawBalance1(double balance, double withdraw) {
        double bal = balance;
        double wit = withdraw;
        double res = 0, res1;
        res1 = wit * 0.05;
        if (bal - res1 - wit > 0) {
            res = bal - res1 - wit;
            System.out.print(res1 + " ");
        }
        return res;
    }

    public static void main(String[] args) {

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int[] balances = {1200, 100, 2000, 500, 3200};
        int i = 100;

        System.out.println("Homework 2.2");
        double res = withdrawBalance1(100, 10);
        System.out.println(res);
        double res1 = withdrawBalance1(100, 99);
        if (res1 > 0)
            System.out.println(res1);
        else
            System.out.println("NO");

    }
}