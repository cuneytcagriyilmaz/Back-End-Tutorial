package Uygulamalar;
import java.util.Scanner;
public class Dairedilimalani {
    public static void main(String[] args) {
        /*
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋   sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */
        double pi = 3.14, r, a, alan;

        Scanner yaricap = new Scanner(System.in);
        System.out.print("Dairenin yarıçapı? ");
        r = yaricap.nextDouble();

        Scanner aci = new Scanner(System.in);
        System.out.print("Merkez açı ölçüsü? ");
        a = aci.nextDouble();

        alan = (pi * (r*r) *a);
        System.out.print(alan);



    }
}
