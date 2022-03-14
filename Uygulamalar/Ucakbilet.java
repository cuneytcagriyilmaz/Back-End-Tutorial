package Uygulamalar;

import java.util.Scanner;

public class Ucakbilet {
    public static void main(String[] args) {
        int mesafe, yas, biletTuru;
        double perKM = 0.10, biletFiyatı,gidisDonusIndirimi;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilecek mesafeyi giriniz(km): ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        yas = input.nextInt();
        if (yas < 0) {
            System.out.println("Hatalı bir değer girdiniz");
        } else {
            System.out.println("Bilet almaya devam edebilirsiniz.");
        }


        System.out.print("Yolculuk Şeklini Giriniz: ");
        biletTuru = input.nextInt();

        biletFiyatı = mesafe * perKM;

        if (biletTuru == 1) {
            System.out.println("Tek Yön Bilet Seçtiniz. ");
            System.out.println("Normal Tutar: " + biletFiyatı);
            if (yas > 0 && yas < 12) {
                biletFiyatı = biletFiyatı / 2;
                System.out.print("Yaş indirimi %50: " + biletFiyatı);
            } else if (yas >= 12 && yas < 24) {
                biletFiyatı = biletFiyatı * 10 / 100;
                System.out.println("Yaş indirimi %10: " + biletFiyatı);
            } else if (yas > 65) {
                biletFiyatı = biletFiyatı * 30 / 100;
                System.out.println("Yaş indirimi %30: " + biletFiyatı);
            } else if (yas >= 24 && yas <= 65) {
                System.out.println("Normal ücret ile hesaplama yapılmıştır." + biletFiyatı);
            } else {
                System.out.println("Yanlış bir yaş seçtiniz");
            }
        } else if (biletTuru == 2) {
            System.out.println("Gidiş-Dönüş Bilet Seçtiniz.");
            System.out.println("Normal Tutar: " + biletFiyatı);
            gidisDonusIndirimi = biletFiyatı * 20 / 100;
            System.out.println("Gidiş-Dönüş İndirimi(%20): " + gidisDonusIndirimi);
            if (yas > 0 && yas < 12) {
                biletFiyatı = (biletFiyatı / 2) - gidisDonusIndirimi;
                System.out.print("Yaş indirimi %50 ve Gidiş Dönüş İndirimi: " + biletFiyatı);
            } else if (yas >= 12 && yas < 24) {
                biletFiyatı = (biletFiyatı) - (biletFiyatı * 10 / 100) - gidisDonusIndirimi;
                System.out.println("Yaş indirimi %10 ve Gidiş Dönüş İndirimi: " + biletFiyatı);
            } else if (yas > 65) {
                biletFiyatı = (biletFiyatı * 30 / 100) - gidisDonusIndirimi;
                System.out.println("Yaş indirimi %30 ve + Gidiş Dönüş İndirimi: " + biletFiyatı);
            } else if (yas >= 24 && yas <= 65) {

                System.out.println("Sadece Gidiş Dönüş İndirimi Uygulanmıştır." + gidisDonusIndirimi);
            } else {
                System.out.println("Yanlış bir yaş seçtiniz");
            }
        } else {
            System.out.println("Hatalı bir seçim yaptınız.");
        }


    }
}

/*
Ödev - Uçak Bileti Fiyatı Hesaplama
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
İpucu
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL
Senaryolar
Senaryo 1
Mesafeyi km türünden giriniz : 1500
Yaşınızı giriniz : 20
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2

Toplam Tutar = 216 TL
Senaryo 2
Mesafeyi km türünden giriniz : -500
Yaşınızı giriniz : 1
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 77

Hatalı Veri Girdiniz !
Senaryo 3
Mesafeyi km türünden giriniz : 200
Yaşınızı giriniz : 35
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1

Toplam Tutar = 20.0 TL
 */
