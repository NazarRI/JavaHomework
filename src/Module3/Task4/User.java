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

    void withdraw(int summ){
       int comission;
        if(summ < 1000){
            comission = (int) (summ * 0.05);
        }
        else{
            comission = (int) (summ * 0.10);
        }
        this.balance = this.balance - summ - comission;
    }

   int companyNameLenfht(){
       return this.companyName.length();
   }

    void monthIncreaser(int addMonth){
        this.monthsOfEmployment += addMonth;
    }

}
