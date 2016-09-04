package Module3.Task4;


public class User {

    private int salary;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private String name;
    private String currency;

    User(String name, String companyName, int balance, int salary, String currency, int monthsOfEmployment) {
        this.name = name;
        this.salary = salary;
        this.currency = currency;
        this.balance = balance;
        this.companyName = companyName;
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public int getSalary() {
        return salary;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    void paySalary() {
        this.balance += this.salary;
    }

    int withdraw(int summ){
       int comission;
       int summOfWithrawal = summ;
        if(summOfWithrawal < 1000){
            comission = (int) (summOfWithrawal * 0.05);
        }
        else{
            comission = (int) (summOfWithrawal * 0.10);
        }
        return getBalance() - summOfWithrawal - comission;
    }

   void companyNameLenfht(){
       int calcName = this.companyName.length();
   }

    void monthIncreaser(int addMonth){
        this.monthsOfEmployment += addMonth;
    }

    public static void main(String[] args) {
        User ob1 = new User("Bobi", "Frrrr", 10000, 2000, "$", 12);

        ob1.paySalary();
        System.out.println(ob1.getBalance());



        ob1.companyNameLenfht();
        System.out.println(ob1.getCompanyName());






    }

}
