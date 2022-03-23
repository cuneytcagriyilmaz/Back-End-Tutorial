package Uygulamalar;
import java.util.Scanner;
import java.util.Arrays;
public class DizideGirilenSayiKontrol {
    public static void main(String[] args) {
        int [] list = {15,12,788,1,-1,-778,2,0};
        int number, max=0, min=0,temp=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı Giriniz: ");
        number = input.nextInt();

        System.out.println(Arrays.toString(list));
        System.out.println("Girilen Sayı: " + number);

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        for (int i : list) {

            if (i < number) {
                min = i;

            }
            if (i > number) {
                max = i;
                break;
            }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);

    }
}
