package Uygulamalar;

import java.util.Scanner;

public class Gecmehesaplama {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        int dersSayisi = 0;
        int toplamPuan = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu giriniz: ");
        matematik = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz: ");
        turkce = input.nextInt();

        System.out.println("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();

        System.out.println("Müzik Notunuzu Girimiz: ");
        muzik = input.nextInt();

        if (!(matematik <= 0 || matematik >= 100)) {
            toplamPuan = matematik + toplamPuan;
            dersSayisi++;
        }
        if (!(fizik <= 0 || fizik >= 100)) {
            toplamPuan = fizik + toplamPuan;
            dersSayisi++;
        }
        if (!(turkce <= 0 || turkce >= 100)) {
            toplamPuan = turkce + toplamPuan;
            dersSayisi++;
        }
        if (!(kimya <= 0 || kimya >= 100)) {
            toplamPuan = kimya + toplamPuan;
            dersSayisi++;
        }
        if (!(muzik <= 0 || muzik >= 100)) {
            toplamPuan = muzik + toplamPuan;
            dersSayisi++;
        }
        double ortalama = toplamPuan / dersSayisi;
        if (ortalama >= 55) {
            System.out.println("Tebrikler Sınıfı Geçtiniz! ");
        } else {
            System.out.println("Seneye Tekrar Deneyiniz");
        }
        System.out.println("Ortalamanız: " + ortalama);
    }
}
