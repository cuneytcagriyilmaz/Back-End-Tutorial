package Uygulamalar;
import java.util.Scanner;
public class Havasıcklıgınaetkinlik {
    public static void main(String[] args) {
        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık kaç derece? ");
        sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak Yapabilirsiniz. ");
        }else if (sicaklik >5 && sicaklik <= 15) {
            System.out.println("Sinemaya Gidebilirsiniz.");
        }else if (sicaklik >15 && sicaklik <= 25) {
            System.out.println("Pikniğe gidebilirsiniz. ");
        }else {
            System.out.println("Yüzmeye Gidebilirisiniz. ");
        }

    }
}
