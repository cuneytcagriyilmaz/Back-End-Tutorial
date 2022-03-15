package Uygulamalar;
// Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
// 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

import java.util.Scanner;

public class Girilensayinınucdortebolunmesi {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı Giriniz.");
        k = input.nextInt();

        for (int i = 3; i <= k; i++ ) {

            if (i % 3 ==0 && i % 4 ==0) {
                System.out.println(i);
            }

        }
    }
}
