package Uygulamalar;
import java.util.Scanner;
public class Basamaksayisitoplama {
    public static void main(String[] args) {

        int number, toplam=0;


        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayılarını toplamka istediğiniz sayı: ");
        number = input.nextInt();

        while (number !=0) {
            int rakamlar = number %10;
            toplam += rakamlar;
            number /= 10;
        }
        System.out.println(toplam);


    }
}
