package Uygulamalar;
import java.util.Arrays;
import java.util.Scanner;

public class DizideElemanSiralama {
    public static void main(String[] args) {

        int boyut;
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin Boyutunu Giriniz: ");
        boyut = input.nextInt();

        int[] list= new int [boyut];

        for (int i = 0; i <list.length; i++ ){
            System.out.print((i+1) + ". Elemanı : ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Sıralama: " + Arrays.toString(list));

    }
}

/*
Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

Senaryo
Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99
 */

