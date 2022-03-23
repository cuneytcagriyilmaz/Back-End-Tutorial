package Uygulamalar.SalaryCalculator;


/*
Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

Sınıfın Nitelikleri

name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı
Sınıfın Metotları

Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
toString() : Çalışana ait bilgileri ekrana bastıracaktır.
 */
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    //Constructer
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    double bonus() {
        if (this.workHours > 40) {
            return workHours - 40;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        int year = 2021 - hireYear;
        if (year > 19) {
            return this.salary * 0.15;
        }
        if (year <19 && year >10){
            return this.salary * 0.1;
        }
        else {
            return this.salary * 0.05;
        }
    }

    void printString() {
        System.out.println("Çalışanın Adı: " + this.name);
        System.out.println("Çalışanın Normal Maaşı: " + this.salary);
        System.out.println("Çalışanın Çalışma Süresi: " + this.workHours);
        System.out.println("Çalışanın İşe Başlangıç Yılı: " + this.hireYear);
        System.out.println("Çalışanın Ödeyeceği Vergi: " + tax());
        System.out.println("Çalışana Ödenecek olan ÇAlışma Saati Bonusu: " + bonus());
        System.out.println("Çalışanın, Çalıştığı Yıla Göre Alacağı Zam: " + raiseSalary());
        System.out.println("Çalışanın Toplam Maaş: " + (this.salary-tax()+bonus()+raiseSalary()) );
        System.out.println("Çalışanın Toplam Maaş Artışı: " + (bonus()+raiseSalary()-tax()));

    }


}


