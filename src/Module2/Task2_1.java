package Module2;

public class Task2_1 {
    static long sum(long [] array) {
        int sum = 0;
        for (long sumDate : array) {
            sum += sumDate;
        }
        return sum;
    }

    static double sum(double[] array) {
        double sum = 0;
        for (double sumDate : array) {
            sum += sumDate;
        }
        return sum;
    }

    static long max(long[] array) {
        long result = array [0];
        for( int i = 0; i < array.length; i++) {
            if (result < array[i]) {
                result = array[i];
            }
        }
        return result;
    }


    static double max(double[] array) {
        double result = array [0];
        for( int i = 0; i < array.length; i++) {
            if (result < array[i]) {
                result = array[i];
            }
        }
        return result;
    }

    static long min(long [] array){
        long result = array[0];
        for(int i = 0; i < array.length; i++) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        return result;
    }

    static double min(double [] array){
        double result = array[0];
        for(int i = 0; i < array.length; i++) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        return result;
    }

    static long maxPositive (long [] array){
        long result = array[0];
        for(int i = 0; i < array.length; i++) {
            while (result < array[i]) {
                result = array[i];
            }
        }
        return result;
    }

    static double maxPositive (double [] array){
        double result = array[0];
        for(int i = 0; i < array.length; i++) {
            while (result < array[i]) {
                result = array[i];
            }
        }
        return result;
    }

    static long maxNegative (long [] array){
        long result = array [0];
        for(int i = 0; i < array.length; i++) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        return result;
    }

    static double maxNegative (double [] array){
        double result = array [0];
        for(int i = 0; i < array.length; i++) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        return result;
    }

    static long multiplication(long [] array){
        long result = array[0];
        for(int i = 1; i < array.length; i++) {
            result = result * array[i];
        }
        return result;
    }

    static double multiplication(double [] array){
        double result = array [0];
        for(int i = 1; i < array.length; i++) {
            result = result * array[i];
        }
        return result;
    }

    static long modulus (long [] array){
        long resultModulus;
        int i = array.length-1;
        long r = array [i];
        long p = array [0];
        resultModulus = p % r;

        return resultModulus;
    }

    static double modulus (double [] array){
        double resultModulus;
        int i = array.length-1;
        double r = array [i];
        double p = array [0];
        resultModulus = p % r;

        return resultModulus;
    }

    static long secondLargest(long [] array) {
        long p = array[0];
        long n = array[0];
        for (int i = 0; i < array.length; i++) {
            if (p < array[i]) {
                p = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (n == p || (array[i] < p && n < array[i])) {
                n = array[i];
            }
        }
        return n;
    }

    static double secondLargest(double [] array){
        double p = array [0];
        double n = array [0];
        for(int i = 0; i < array.length; i++) {
            if (p < array[i]) {
                p = array[i];
            }
        }
        for(int i = 0; i < array.length; i++) {
            if (n == p || (array[i] < p && n < array[i])) {
                n = array[i];
            }
        }
        return n;
    }

    public static void main(String[] args) {


        long[] date1 = {23, 66, 94, 111, 254, 11, 1, 9, 101, 43};
        double[] date2 = {22.7, -176.2, 54.1, 69.7, 77.7, 292.2, -42.8, -443.5, 813.3, -2.7};

        System.out.println("Результат вычислений массива date1 типа int:");
        long sum = sum(date1);
        System.out.println("Результат сложения чисел массива date1 типа int = " + sum);

        long sum3 = max(date1);
        System.out.println("Результат поиска максимального числа массива date1 типа int = " + sum3);

        long sum5 = min(date1);
        System.out.println("Результат поиска минимального числа массива date1 типа int = " + sum5);

        long sum7 = maxPositive(date1);
        if (sum7 > 0)
            System.out.println("Результат поиска максимального положительного числа массива date1 типа int = " + sum7);
        else
            System.out.println("в массиве date1 типа int отсутствуют положительные числа");

        long sum9 = maxNegative(date1);
        if (sum9 < 0)
            System.out.println("Результат поиска максимального отрицательного числа массива date1 типа int = " + sum9);
        else
            System.out.println("В массиве date1 типа int отсутствуют отрицательные числа");

        long sum11 = multiplication(date1);
        System.out.println("Умножение чисел массива date1 типа int = " + sum11);

        long sum13 = modulus(date1);
        System.out.println("Результат деления первого и последнего числа по модулю массива date1 типа int = " + sum13);

        long sum15 = secondLargest(date1);
        System.out.println("Второе по величине значение массива date1 типа int = " + sum15);

        System.out.println(" ");
        System.out.println("Результат вычислений массива date2 типа double:");

        double sum1 = sum(date2);
        System.out.println("Результат сложения массива date2 типа double = " + sum1);

        double sum4 = max(date2);
        System.out.println("Результат поиска максимального числа массива date2 типа double = " + sum4);

        double sum6 = min(date2);
        System.out.println("Результат поиска минимального числа массива date2 типа double = " + sum6);

        double sum8 = maxPositive(date2);
        if (sum8 > 0)
            System.out.println("Результат поиска максимального положительного числа массива date2 типа double = " + sum8);
        else
            System.out.println("в массиве date2 типа double отсутствуют положительные числа");


        double sum10 = maxNegative(date2);
        if (sum10 < 0)
            System.out.println("Результат поиска максимального отрицательного числа массива date2 типа double = " + sum10);
        else
            System.out.println("В массиве date2 типа double отсутствуют отрицательные числа");

        double sum12 = multiplication(date2);
        System.out.println("Умножение чисел массива date2 типа double = " + sum12);


        double sum14 = modulus(date2);
        System.out.println("Результат деления первого и последнего числа по модулю массива date2 типа double = " + sum14);

        double sum16 = secondLargest(date2);
        System.out.println("Второе по величине значение массива date2 типа double = " + sum16);

    }

}
