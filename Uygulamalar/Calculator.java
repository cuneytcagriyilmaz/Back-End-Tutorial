package Uygulamalar;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

    //Değişkenleri oluştur
        int matematik, fizik, kimya, turkce, tarih, music;

        //kullanıcıdan notları almak lazım bu yüzden scanner i eklemeliyiz

        Scanner notlar = new Scanner(System.in);

    //kullanıcıdan hangi değeri girmesi gerektiğini kullanıcıya söylemeliyiz
        System.out.print("Matematik notunuz ?: ");
        // matematik notunu scanner ile almalıyız
        matematik = notlar.nextInt();
        System.out.println(matematik);

        System.out.print("fizik notunuz ?: ");
        fizik = notlar.nextInt();
        System.out.println(fizik);

        System.out.print("kimya notunuz ?: ");
        kimya = notlar.nextInt();
        System.out.println(kimya);

        System.out.print("turkce notunuz ?: ");
        turkce = notlar.nextInt();
        System.out.println(turkce);

        System.out.print("tarih notunuz ?: ");
        tarih = notlar.nextInt();
        System.out.println(tarih);

        System.out.print("music notunuz ?: ");
        music = notlar.nextInt();
        System.out.println(music);

        // bölme işlemi yapacağımız için double türünde değişken tanımlamak daha doğru.
        int toplam = (matematik + fizik+ kimya + tarih+ turkce+ music);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: " + sonuc);
        boolean sonuc2 = sonuc >60 ;

        String gectimkaldidurumu =  sonuc2 ? "Geçti" : "Kaldı";
        System.out.println(gectimkaldidurumu);

    }

}
