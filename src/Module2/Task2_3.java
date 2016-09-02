package Module2;

import java.util.Arrays;
import java.util.Comparator;

public class Task2_3 {
    private static int[] balances = {1200, 250, 2000, 500, 3200};
    private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    private static double comission = 0.05;

    static double withdrawBalance(String ownerName, double withdrawal) {
        double balance = balances[0];
        double com = comission * withdrawal;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName) {
                balance = balances[i] - com - withdrawal;
            }
        }
        return balance;
    }

    public static void main(String[] args) {
        String ownerName = "Ann";
        double withdrawal = 100;
        double res1 = withdrawBalance(ownerName, withdrawal);
        if(res1 > 0) {
            System.out.println(ownerName + " " + withdrawal + " " + res1);
        }
        else{
            System.out.println(ownerName + " NO");
        }

        String ownerName2 = "Oww";
        double withdrawal2 = 490;
        double res2 = withdrawBalance(ownerName2, withdrawal2);
        if(res2 > 0) {
            System.out.println(ownerName2 + " " + withdrawal2 + " " + res2);
        }
        else{
            System.out.println(ownerName2 + " NO");
        }
