package Uygulamalar;
// Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
// 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

import java.util.Scanner;

public class Girilensayinınucdortebolunmesi {
    public static void main(String[] args) {
        int k, ortalama;
        int toplam = 0, n = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı Giriniz.");
        k = input.nextInt();


        for (int i = 1; i <= k; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                toplam = toplam + i;
                System.out.println(i);
                n++;

            }

        }
        System.out.println(k + " 'kadar 3'e ve 4'e bölünen sayıların ortalaması: " + toplam / n);

    }
}
