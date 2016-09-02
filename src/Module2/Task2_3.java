
public class Task2_3 {
    private static int[] balances = {1200, 300, 2000, 500, 3200};
    private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    private static double comission = 0.05;

    static double withdrawBalance(String ownerName, double withdrawal) {
        String ownName = ownerNames[0];
        int balance = balances[0];
        double wit = withdrawal;
        double com = comission * wit;
        for (int i = 0; i < ownerNames.length; i++)
            if (ownerNames[i] == ownerName)
             System.out.println(ownerName + " " + (balances[i] - com - wit));
                return com;
    }




    public static void main(String[] args) {
        String ownerName = "Ann";
        double withdrawal = 100;
        double res1 = withdrawBalance(ownerName, withdrawal);
        if(res1 > 0) {
            System.out.println(res1);
        }
        else{
            System.out.println("NO");
        }

        String ownerName2 = "Oww";
        double withdrawal2 = 490;
        double res2 = withdrawBalance(ownerName2, withdrawal2);
        if(res2 > 0) {
            System.out.println(res2);
        }
        else{
            System.out.println("NO");
