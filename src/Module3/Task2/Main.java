package Module3.Task2;

public class Main {
    public static void main(String[] args) {
        Adder ob1 = new  Adder();
        boolean check;
        int add;

        check = ob1.check(5, 4);
        add = ob1.add(5,4);

        System.out.println(add);
        System.out.println(check);
    }
}
