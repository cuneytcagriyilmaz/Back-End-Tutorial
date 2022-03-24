package Uygulamalar;

import java.util.Arrays;

public class TekrarEdenCiftSayilar {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {1, 2, 2, 3, 4, 5, 6, 6, 7, 8, 9, 8};
        int[] even = new int[list.length];

        int startindex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && (list[i] == list[j]) && (list[i] % 2 == 0) && (list[j] % 2 == 0)) {
                    if (!isFind(even, list[i])) {
                        even[startindex++] = list[i];

                    }
                    break;

                }
            }
        }
        for (int value : even) {
            if (value != 0) {
                System.out.println(value);
            }
        }

    }
}
