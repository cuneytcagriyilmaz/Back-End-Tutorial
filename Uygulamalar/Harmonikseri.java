package Uygulamalar;
import java.util.Scanner;
public class Harmonikseri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        int n = input.nextInt();
        double result = 0.0; //0.0 yazmamızın değeri double ile double'ı böleceğiz(result işleminde)
        for (int i=1; i<=n; i++) { // int yerine double yazarsak resulttaki 1.0 ı 1 ile değiştiririz.
            result += (1.0/i);

        }
        System.out.print(result);

    }
}
