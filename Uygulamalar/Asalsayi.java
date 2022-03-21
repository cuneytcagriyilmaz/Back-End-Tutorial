package Uygulamalar;

import java.util.Scanner;

public class Asalsayi {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean istrue = true;
            for (int a = 2; a < i; a++) {
                if (i % a == 0) {
                    istrue = false;
                    break;
                }
            }
            if (istrue) {
                System.out.print(i + " ");
            }
        }
    }
}
