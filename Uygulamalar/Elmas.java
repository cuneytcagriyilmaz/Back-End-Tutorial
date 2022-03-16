package Uygulamalar;

import java.util.Scanner;

public class Elmas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int p = 1; p < n; p++){
            for (int r=1; r <= p; r++){
                System.out.print(" ");
            }
            for (int s =1; s <= 2*(n-p)-1; s++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
