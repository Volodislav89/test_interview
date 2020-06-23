package main.array_remove;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList("aaaaa", "bbbb", "ccc", "d", "eeee", "g", "h", "hh"));
        removeElements(arrayList);
        for (String s: arrayList) {
            System.out.println(s.length());
        }
    }
    public static void removeElements(ArrayList<String> list) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (String s: list) {
            if (s.length() != 1) {
                stringArrayList.add(s);
            }
        }
        list.removeAll(list);
        list.addAll(stringArrayList);
    }
}
