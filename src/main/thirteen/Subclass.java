package main.thirteen;

public class Subclass extends SuperClass {
    @Override
    public void call() {
        System.out.println("call from Subclass");
    }

    @Override
    public void callParent() {
        super.call();
    }
}
