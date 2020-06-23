package main.six;

public class TestStatic {
    public static void main(String[] args) {
        A a = new A();
        a.itStatic();
        a.that();

        A aa = new B();
        aa.itStatic();
        aa.that();

        B b = new B();
        b.itStatic();
        b.that();
    }
}
