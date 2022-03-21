package Uygulamalar;

import java.util.Scanner;

public class Maxmin {
    public static void main(String[] args) {
        int numbervalue,max = 0, min = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        numbervalue = input.nextInt();

        for (int i = 1; i <= numbervalue; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int n = input.nextInt();
            if (i == 1) {
                max = n;
                min = n;
            }else {
                if (n > max){
                    max = n;
                }
                if (n < min) {
                    min = n;
                }
            }
        }
        System.out.println("Max Number: " + max);
        System.out.print("Min number: "+ min);
    }
}

/*
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları
bulan ve bu sayıları ekrana yazan programı yazın.

Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22
 */