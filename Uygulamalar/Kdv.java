package Uygulamalar;
import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {
        double price, taxRate, priceWithTax, priceWithoutTax;

        Scanner input= new Scanner(System.in);
        System.out.print("Product Price: ");
        //alınan input değerini price'a atadık
        price = input.nextDouble();

        taxRate = (price>1000) ? 0.08 : 0.18;
        priceWithoutTax = price;
        priceWithTax = price * taxRate;

        System.out.println( "Tax Rate: " +taxRate);
        System.out.println("Price without Tax: "  + priceWithoutTax);
        System.out.println("Price with Tax: "  + priceWithTax);



    }
}
