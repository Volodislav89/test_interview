package main.six;

public class B extends A {
    public static void itStatic() {
        System.out.println("it B");
    }

    @Override
    public void that() {
        System.out.println("that B");
    }
}
