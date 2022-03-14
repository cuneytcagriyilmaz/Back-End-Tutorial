package Uygulamalar;
import java.util.Scanner;

public class kullanicigirisi {
    public static void main(String[] args) {
        String username,password,newPassword;
        int islem;

        Scanner inputUsername = new Scanner(System.in);
        System.out.print("Enter your username: ");
        username = inputUsername.nextLine();

        Scanner inputPassword = new Scanner(System.in);
        System.out.print("Enter your password: ");
        password = inputPassword.nextLine();

        // Stringler biribirie eşitlenirken .equals() kullanılır

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Sisteme giriş yaptınız");
        }else {
            System.out.println("Bilgiler yanlış");

            Scanner inputislem = new Scanner(System.in);
            System.out.println("Şifrenizi değiştirmek için 1'e basın. Değiştirmek istemiyorsanız 2'ye basın");

            islem = inputislem.nextInt();
            if (islem == 1) {
                Scanner inputNewPassword = new Scanner(System.in);
                System.out.println("Yeni Şifrenizi Giriniz");
                newPassword = inputNewPassword.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.println("Yeni şifreniz Eski Şifreniz İle Aynı Olamaz");
                }else{
                    System.out.println("Yeni Şifreniz: " + newPassword);
                }
            }else if (islem == 2) {
                System.out.println("Şifreniz değiştirilmedi");
            }else {
                System.out.println("Yanlış Bir Seçim Yaptınız");
            }

        }

    }
}
