package Uygulamalar;
import java.util.Scanner;
public class DesenMetot {
    static int recursive(int num, int flag, int x){

        if (flag == 0) {
            System.out.println(num);
            return 1;
        }
        if (flag > x){
            System.out.print(num + " ");
            return recursive(num - 5, flag - 1,x);
        } else {
            System.out.print(num + " ");
            return recursive(num + 5, flag - 1, x);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int N = inp.nextInt();
        int flag = N % 5 != 0 ? ((N / 5) +1) : (N / 5);
        recursive(N, flag * 2 , flag );
    }
}
