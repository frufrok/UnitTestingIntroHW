package Lesson6;

import java.util.ArrayList;

public class Program {
    public static void main(final String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>() {
            {
                add(1);
                add(2);
                add(3);
            }
        };
        ArrayList<Integer> list2 = new ArrayList<>() {
            {
                add(2);
                add(3);
                add(4);
            }
        };
        ListComparator lc = new ListComparator(list1, list2);
        System.out.println(lc.getBiggerListMessage());
    }
}
