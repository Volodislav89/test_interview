package main.try_catch;

public class Test {
    public static void badMethod() {
        throw new Error();
    }

    public static void main(String[] args) {
        try {
            System.out.println("A");
            badMethod();
        } catch (Exception ex) { // иерархия Error не является Exception
            System.out.println("B");
        } catch (Throwable ex1) {
            System.out.println("C");
        } finally {
            System.out.println("D");
        }
        System.out.println("E");
    }
}
