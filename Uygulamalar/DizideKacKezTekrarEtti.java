package Uygulamalar;

public class DizideKacKezTekrarEtti {

    static boolean isRepeat(int[] array, int number){
        for (int i : array){
            if (i == number){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int [] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] repeat = new int[list.length];
        int count = 0, startIndex = 0;
        for (int i =0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if (list[i] == list[j]){
                    count++;
                }
            }if (!isRepeat(repeat,list[i])){
                repeat[startIndex++] = list[i];
                System.out.println(list[i] + " sayisi" + count + " kere tekrar etti");
            }
        }count = 0;

    }
}

/*
Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.
 */