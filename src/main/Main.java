package main;

public class Main {
    public static void main(String[] args) {
        //Fibonachi
        int n0 = 1;
        int n1 = 1;
        int n2;
        for (int i = 3; i < 10; i++) {
            n2 = n0 + n1; // 2
            System.out.println(n2); //2
            n0 = n1; // 1
            n1 = n2; // 2
        }
        System.out.println(fact(15));
    }
    private static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    private static int fact1(int n) {
        if (n < 0) {
            System.out.println("Зачем тебе факториал из отрицательного числа?");
            return 0;
        }
        int result = 1;
        if (n == 0) {
            return result;
        }
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    private static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n-1); //3 * factorial(2) * factorial(1)
        return result;
    }
}

