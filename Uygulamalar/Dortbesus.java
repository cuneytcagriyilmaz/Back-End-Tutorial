package Uygulamalar;

import java.util.Scanner;

//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
public class Dortbesus {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz: ");
        n = input.nextInt();

        for (int i = 1; i < n; i *=4) {
            System.out.print( + i+ ",");
        }System.out.println("   4'ün kuvvetleri: " );


        for (int i = 1; i < n; i *=5) {
            System.out.print( + i+ ",");
        }System.out.println("   5',n kuvvetleri: " );

    }
}
