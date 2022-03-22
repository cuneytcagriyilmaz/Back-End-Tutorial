package Uygulamalar;

import java.util.Scanner;

public class Recursiveusalma {
    /*
        static int power(int a , int b) {

            Scanner input = new Scanner(System.in);

            System.out.print("Base Value: ");
            a = input.nextInt();

            System.out.print("Power Value: ");
            b = input.nextInt();

            int result = 1;
            for (int i = 1; i <= b; i++){
                result *= a;
            }
            System.out.println(a + " Power " + b +" = " +result);
            return result;
        }

     */
    static int power(int base, int power) {
        if (power == 0)
            return 1;
        int result = 1;
        //result *= power(base, power - 1) * base;
        result = result * power(base, power - 1) * base;
        return result;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, power;
        System.out.print("Please enter the base: ");
        base = input.nextInt();
        System.out.print("Please enter the power ");
        power = input.nextInt();

        System.out.println(power(base,power));
    }
}
/*
    3 ** 4
    3 * 3 * 3 * 3
 */

/*
Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

Senaryo

Taban değeri giriniz :2
Üs değerini giriniz : 0
Sonuç : 1
Taban değeri giriniz : 2
Üs değerini giriniz : 3
Sonuç : 8
Taban değeri giriniz : 5
Üs değerini giriniz : 3
Sonuç : 125
 */