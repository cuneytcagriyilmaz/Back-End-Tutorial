package Uygulamalar;
import java.util.Scanner;
public class Vucutkitle {
    public static void main(String[] args) {

        double boy,kilo,kitleEndex;

        Scanner boyValue = new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz: ");
        boy = boyValue.nextDouble();

        Scanner kiloValue = new Scanner(System.in);
        System.out.print("Ağırlığınızı giriniz: ");
        kilo = kiloValue.nextDouble();

        kitleEndex =  (kilo / (boy * boy));
        System.out.print("Vücut Kitle Endexiniz: " + kitleEndex);

    }
}
