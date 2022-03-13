package Uygulamalar;
import java.util.Scanner;

public class Manavkasa {
    public static void main(String[] args) {
        double armut=2.14, elma= 3.67, domates = 1.11, muz =0.95, patlican=5;

        Scanner inputElma = new Scanner(System.in);
        System.out.print("Kaç kilogram elma aldın? ");
        elma *= inputElma.nextDouble();

        Scanner inputArmut = new Scanner(System.in);
        System.out.print("Kaç kilogram armut aldın? ");
        armut *= inputArmut.nextDouble();

        Scanner inputDomates = new Scanner(System.in);
        System.out.print("Kaç kilogram domates aldın? ");
        domates *= inputDomates.nextDouble();

        Scanner inputMuz = new Scanner(System.in);
        System.out.print("Kaç kilogram muz aldın? ");
        muz *= inputMuz.nextDouble();

        Scanner inputPatlican = new Scanner(System.in);
        System.out.print("Kaç kilogram patlıcan aldın? ");
        patlican *= inputPatlican.nextDouble();

        double toplamTutar = (armut+elma+domates+muz+patlican);
        System.out.println("Harcadığın toplam tutar: " + toplamTutar);
    }
}
