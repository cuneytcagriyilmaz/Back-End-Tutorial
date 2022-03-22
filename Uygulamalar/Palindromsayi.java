package Uygulamalar;

import java.util.Scanner;

public class Palindromsayi {


    //Girilen sayı Palindron mu değilmi diye boolean değer oluştururuz
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastnumber;
        while (temp != 0) { // gezecek basamak kalmadığında 0 kalır ve döngüden çıkar
            //System.out.println("=========================");
            //System.out.println("Sayı = >" + temp);
            lastnumber = temp % 10;
            //System.out.println("Son Basamak = >" + lastnumber);

            //Sayıyı tersten yazacağımıaz için en sondaki sayıyı en başa getiriyoruz.
            // 247 nin' 742 olurkenki durumu. 7 yüzler basamağında. döngü tekrarlanınca yüzler basamağına geçer
            // ne kadar tekrtar ederse o kadar büyür.
            reverseNumber = (reverseNumber * 10) + lastnumber;

            //System.out.println("Yeni Sayı =>" + reverseNumber);
            temp /= 10;
        }

        if (number == reverseNumber)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {

        System.out.println(isPalindrom(101));

        System.out.println(isPalindrom(10));


    }
}


/*
Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
 */