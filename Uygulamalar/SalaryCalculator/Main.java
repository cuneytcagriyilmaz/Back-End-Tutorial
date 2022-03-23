package Uygulamalar.SalaryCalculator;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ali",1500.0,20,2005);
        Employee e2 = new Employee("Ahmet", 500.0,50,1990);

        e1.printString();
        System.out.println("_______________");
        e2.printString();

    }
}
