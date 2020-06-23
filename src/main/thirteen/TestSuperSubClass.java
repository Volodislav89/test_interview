package main.thirteen;

public class TestSuperSubClass {
    public static void main(String[] args) {
//        Subclass a = new SuperClass();
//        a.call();
//        a.callParent();

        SuperClass c = new Subclass();
        c.call();
        c.callParent();

    }
}
