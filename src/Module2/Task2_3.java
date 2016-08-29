package Module2;

public class Task2_3 {
    static double withdrawBalance(String[] ownerName, double withdrawal, int[] balance) {
        String ownN = ownerName[0];
        String ownN1 = ownerName[0];
        double bal = balance[0];
        double bal1 = balance[0];
        double wit = withdrawal;
        double res;
        res = wit * 0.05;
        for (int i = 0; i < ownerName.length; i++) {
            ownN = ownerName[3];
        }
        for (int k = 0; k < balance.length; k++) {
            bal = balance[3];
        }
        bal = bal - res - wit;

        System.out.print(ownN + " ");

        return bal;
    }

    public static void main(String[] args) {

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int[] balances = {1200, 100, 2000, 500, 3200};
        int drawable = 490;

        double res1 = withdrawBalance(ownerNames, drawable, balances);
        if(res1 > 0) {
            System.out.println(res1 +" "+drawable);
        }
        else{
            System.out.println("NO");
        }



    }
}
