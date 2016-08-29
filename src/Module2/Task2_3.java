package Module2;

public class Task2_3 {
    public static int[] balances = {1200, 100, 2000, 500, 3200};
    static double withdrawBalance(String[] ownerName, double withdrawal) {
        String ownN = ownerName[0];
        double bal;
        double wit = withdrawal;
        double res;
        res = wit * 0.05;
        for (int i = 0; i < ownerName.length; i++) {
            ownN = ownerName[3];
        }
        bal = balances[1];

        bal = bal - res - wit;

        System.out.print(ownN + " ");

        return bal;
    }

    public static void main(String[] args) {

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int drawable = 80;

        double res1 = withdrawBalance(ownerNames, drawable);
        if(res1 > 0) {
            System.out.println(res1 +" "+drawable);
        }
        else{
            System.out.println("NO");
        }



    }
}
