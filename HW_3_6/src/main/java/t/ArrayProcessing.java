package t;

import java.util.Arrays;

public class ArrayProcessing {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sliceArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        System.out.println(hasOneAndFour(new int[]{1, 1, 1, 1, 1, 4, 1, 4, 4,4, 4}));
        System.out.println(hasOneAndFour(new int[]{1, 1, 1, 1}));
        System.out.println(hasOneAndFour(new int[]{1, 1, 1, 1, 1, 4, 4, 2, 4, 1, 4}));
    }

    public static int[] sliceArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) return Arrays.copyOfRange(arr, i + 1, arr.length);
        }
        throw new RuntimeException("4 not found");
    }

    public static boolean hasOneAndFour(int[] arr) {
        boolean has1 = false;
        boolean has4 = false;

        for (int j : arr) {
            if (j == 1) has1 = true;
            else if (j == 4) has4 = true;
            else return false;
        }
        return has1 && has4;
    }
}
