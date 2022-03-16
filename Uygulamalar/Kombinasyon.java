package Uygulamalar;

import java.util.Scanner;

/*
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)

 */
public class Kombinasyon {
    public static void main(String[] args) {
        int n, r, total1 = 1, total2 = 1, total3 = 1;
        double combination;

        Scanner inputn = new Scanner(System.in);
        System.out.print("n değerini giriniz: ");
        n = inputn.nextInt();

        for (int i = 1; i <= n; i++) {
            total1 = total1 * i;

        }
        System.out.println(n + "! Faktöriyel = " + total1);

        Scanner inputr = new Scanner(System.in);
        System.out.print("r değerini giriniz: ");
        r = inputr.nextInt();

        for (int j = 1; j <= r; j++) {
            total2 = total2 * j;
        }
        System.out.println(r + "! Faktöriyel = " + total2);

        for (int z = 1; z <= (n-r); z++) {
            total3 = total3 * z;
        }
        System.out.println(n-r + "! Faktöriyel = " + total3);

        combination = total1 / (total2-total3);
        System.out.println("Combination: "+ combination);

    }
}
