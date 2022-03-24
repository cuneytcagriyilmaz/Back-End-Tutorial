package Uygulamalar;

import java.util.Arrays;

public class DiziMatrisTranspose {
    public static void main(String[] args) {
        int[][] list1 = {{2, 3, 4}, {5, 6, 4}};
        System.out.println("Matris: ");
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1.length; j++) {
                System.out.print(list1[i][j] + "   ");
                System.out.println();
            }
        }
        System.out.println("Transpoze:");
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1.length; j++)
                System.out.print(list1[i][j] + "   ");
            System.out.println();

        }

    }

}


/*
Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.

Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.


Senaryo

Matris :
2    3    4
5    6    4
Transpoze :
2    5
3    6
4    4

Matris :
1    2    3
4    5    6
Transpoze :
1    4
2    5
3    6
 */