package Uygulamalar;
import java.util.Scanner;
public class Alan {
    public static void main(String[] args) {
        double a,b,c,cevre,alan;

        Scanner birinci = new Scanner(System.in);
        System.out.print("Birinci Kenarın Uzunluğunu Giriniz: ");
        a = birinci.nextDouble();

        Scanner ikinci = new Scanner(System.in);
        System.out.print("İkinci Kenarın Uzunluğunu Giriniz");
        b= ikinci.nextDouble();

        Scanner ucuncu = new Scanner(System.in);
        System.out.print("Üçüncü Kenarın Uzunluğunu Giriniz: ");
        c = ucuncu.nextDouble();

        cevre = a + b + c;
        double u = cevre /2;
        alan = Math.sqrt( u * (u-a) * (u-b) * (u-c) );
        System.out.print(alan);
        
    }
}
