package Uygulamalar;

import java.util.Scanner;



public class Ciftdordunkati {
    public static void main(String[] args) {

        int n;
        int total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            n = input.nextInt();
            if (n % 4 == 0) {
                total += n;

            }
        } while (n % 2 == 0);
        System.out.print("Total " + total);
    }
}
