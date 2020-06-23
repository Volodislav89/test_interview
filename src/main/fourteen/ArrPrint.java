package main.fourteen;

public class ArrPrint {
    public static void main(String[] args) {
        int[] arr2 = {1, 2, 3};
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j]);
            arr2[j] += 5;
        }
        System.out.println();
        for (int element : arr2) {
            System.out.print(element);
        }
        System.out.println();
    }
}
