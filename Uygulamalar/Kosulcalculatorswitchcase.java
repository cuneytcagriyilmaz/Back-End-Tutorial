package Uygulamalar;

import java.util.Scanner;

public class Kosulcalculatorswitchcase {
    public static void main(String[] args) {
        int number1, number2, select;

        Scanner inputnumber1 = new Scanner(System.in);
        System.out.print("Number1: ");
        number1 = inputnumber1.nextInt();

        Scanner inputnumber2 = new Scanner(System.in);
        System.out.print("Number2: ");
        number2 = inputnumber2.nextInt();

        Scanner inputSelect = new Scanner(System.in);
        System.out.println("1-Addition \n2-Subtraction \n3-Multiplication \n4-Division");
        System.out.println("Do your selecting");
        select = inputSelect.nextInt();

        switch (select) {
            case 1:
                System.out.println("Addition: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Subtraction: " + (number1-number2));
                break;
            case 3:
                System.out.println("Multiplication: "+ (number1*number2));
                break;
            case 4:
                switch (number2){
                    case 0:
                        System.out.println("Bir sayı sıfıra bölünemez");
                        break;
                    default:
                        System.out.println("Division: "+ (number1/number2));
                        break;
                }

        }


    }
}
