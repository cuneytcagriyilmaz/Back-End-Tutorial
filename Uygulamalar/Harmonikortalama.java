
package Uygulamalar;
import java.util.Arrays;


public class Harmonikortalama {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        double harmonic=0.0;
        double average =0.0;
        for (int i = 0 ; i <array.length; i++) {
            harmonic = harmonic + (1.0/array[i]);
        }
        average = array.length/harmonic;
        System.out.println("Harmonik Ortalama: " + average);
    }
}
