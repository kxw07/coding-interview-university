package others;

import org.openjdk.jol.info.ClassLayout;

public class TrySomething {
    public static void main(String[] args) {
        arrays();
    }

    public static void arrays() {
        int[] array = {1, 2, 3, 4, 5};
        Integer[] integers = {1, 2, 3, 4, 5};
        Integer i[] = {1, 2, 3, 4, 5}; // work, but this is c style.

        for (int idx = 0; idx < len(array); idx++) {
            System.out.println(array[idx]);
        }

        System.out.println(ClassLayout.parseInstance(array).toPrintable());
        System.out.println(ClassLayout.parseInstance(integers).toPrintable());
    }

    private static int len(int[] array) {
        System.out.println("really call every time in loop");
        return array.length;
    }
}
