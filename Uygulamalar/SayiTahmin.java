import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        /*
        // 0 la 100 arasında double değerler üretiyor bunu int yapmak için (int) yazılır bşaına
        int number = (int) (Math.random() * 100);
        System.out.println(number);
         */


        // ikinci yol 0 la 100 arasında rasgele tam sayılar üretti
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);

        int right = 0; // kullanıcı hakkı
        int selected;
        int[] wrong = new int[5]; // girilen yanlış değerleri bir array de toplamak için
        System.out.println(number);
        boolean isWin = false;
        boolean isWrong = false; //hatalı giriş yapmadı şuan
        while (right < 5) {
            System.out.println("Tahmininizi giriniz: ");

            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında değer giriniz.");
                if (!isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giirş yaptınız. Kalan hak: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue; // Yanlış bir değer girerse diğer döngüye geçer

            }
            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğiniz sayı: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür. ");
                } else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür.");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hakkınız: " + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz! ");
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
        }

    }

}
