package main.nine;

public class TestOperator {
    public static void main(String[] args) {
        A a = null;
        if (a == null || !a.exists())
            System.out.println("B");

        a = new A();
        if (a == null && !a.exists())
            System.out.println("C");

        if (a.exists())
            System.out.println("D");
    }
}
