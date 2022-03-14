package Uygulamalar;
import java.util.Scanner;
public class Cinzodyak {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz");
        year = input.nextInt();

        if (year%12 ==0){
            System.out.println("Çin Zodyağı Burnuz: Maymun");
        }else if (year%12 ==1 ){
            System.out.println("Çin Zodyağı Burnuz: Horoz");
        }else if (year %12 == 2) {
            System.out.println("Çin Zodyağı Burnuz: Köpek");
        }else if (year %12 == 3) {
            System.out.println("Çin Zodyağı Burnuz: Domuz");
        }else if (year %12 == 4) {
            System.out.println("Çin Zodyağı Burnuz: Fare");
        }else if (year %12 == 5) {
            System.out.println("Çin Zodyağı Burnuz: Öküz");
        }else if (year %12 == 6) {
            System.out.println("Çin Zodyağı Burnuz: Kaplan");
        }else if (year %12 == 7) {
            System.out.println("Çin Zodyağı Burnuz: Tavşan");
        }else if (year %12 == 8) {
            System.out.println("Çin Zodyağı Burnuz: Ejderha");
        }else if (year %12 == 9) {
            System.out.println("Çin Zodyağı Burnuz: Yılan");
        }else if (year %12 == 10) {
            System.out.println("Çin Zodyağı Burnuz: At");
        }else if (year %12 == 11) {
            System.out.println("Çin Zodyağı Burnuz: Koyun");
        }
    }
}
