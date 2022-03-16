package Uygulamalar;

import java.util.Scanner;

public class Usalmafordongusu {
    public static void main(String[] args) {

        int n, k;

        Scanner input = new Scanner(System.in);

        System.out.println("Üssü alınacak sayı: ");
        n = input.nextInt();

        System.out.println("Üs olacak sayı: ");
        k = input.nextInt();

        int total = 1; // çarpılacağı için ilk değer 1 oldu.
        for (int i = 1; i <= k; i++) {
            total *= n;

        }
        System.out.print("Cevap: " + total);

    }
}
