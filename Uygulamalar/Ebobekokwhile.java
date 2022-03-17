package Uygulamalar;
import java.util.Scanner;
public class Ebobekokwhile {
    public static void main(String[] args) {
        int ebob = 1, n1, n2;
        Scanner input = new Scanner(System.in);

        System.out.println("n1'i giriniz: ");
        n1 = input.nextInt();

        System.out.println("n2'yi Giriniz: ");
        n2 = input.nextInt();

        if (n1 < n2){
            int i =1;
            while ( i<=n1 ){
                if (n1 % i ==0 && n2 %i ==0) {
                    ebob=i;
                }
                i++;
            }
            System.out.println("Ebob: "+ebob);
        }
        else
        {
            int i=1;
            while (i<=n2) {
                if (n1%i==0 && n2%i==0) {
                    ebob=i;
                }
                i++;
            }
            System.out.println("Ebob: "+ebob);
        }


        int i=1;
        while (i<=(n1*n2)) {
            if (i%n1==0 && i%n2==0) {
                System.out.println("Ekok: "+i);
                break;
            }
            i++;
        }

        System.out.println(n1*n2 / ebob);
    }
}