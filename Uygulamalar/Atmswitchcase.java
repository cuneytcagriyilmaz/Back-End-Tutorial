package Uygulamalar;

import java.util.Scanner;

public class Atmswitchcase {
    public static void main(String[] args) {
        int right = 3; //Şifre girme hakkı
        int balance = 1500; //balance = bakiye
        int select;
        String userName, password;
        while (right > 0) {

            Scanner input = new Scanner(System.in);

            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();

            System.out.print("Şifreniz: ");
            password = input.nextLine();

            //stringde eşitleme yaparken .equals kullanılır.
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz bankasına hoş geldiniz!");

                do {

                    System.out.println(" 1- Para Yatırma \n"
                            + "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4- Çıkış yap");
                    System.out.println("Yapmak istediğiniz işlemi seçiniz.");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırılacak Para Miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println(balance);
                            break;

                        case 2:
                            System.out.println("Çekilecek Para Miktarı: ");
                            price = input.nextInt();

                            if (price > balance) {
                                System.out.println("Bakiye yetersiz");
                            } else {
                                balance -= price;
                                break;
                            }

                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }

                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere. ");
                break;
            } else {
                right--;
                System.out.println("hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Banka ile iletişime geçin");
                } else {
                    System.out.println("Kalan hakkınız: " + right); // --riight hakkı bir azalt

                }
            }
        }

    }
}
