package Uygulamalar;

import java.util.Scanner;

public class Artikyil {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Yılı Giriniz: ");
        year = input.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " Bir Artık Yıldır");
            }else {
                System.out.println(year + "  Bir Artık Yıl Değildir.");
            }

        }else if (year % 4 == 0) {
            System.out.println(year + "  Artık Yıldır");
        }else {
            System.out.println(year + " Artık Yıl Değildir.");
        }
    }

}

