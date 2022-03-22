package Uygulamalar.Siniflar.NotSistemi;

public class Student {

    // 3 tane ders alacakları için 3 tane tanımladık
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;

        this.average = 0.0;
        this.isPass = false;
    }

    //notlara Girdi sağlayacağımız için void yaptık
    void addBulkExamNote(int note1, int note2, int note3, int optionNote1, int optionNote2, int optionNote3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
            this.c1.optionNote = optionNote1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
            this.c2.optionNote = optionNote2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
            this.c3.optionNote = optionNote3;
        }

    }

    void isPass() {
        this.average = (this.c1.note * 8.0 / 10 + this.c1.optionNote * 2.0 / 10) + (this.c2.note * 8.0 / 10 + this.c2.optionNote * 2.0 / 10) + (this.c3.note * 8.0 / 10 + c3.optionNote * 2.0 / 10) / 3.0;
        if (this.average > 55) {
            System.out.println("Hababam Sınıfı Uyanıyor.");
            this.isPass = true;

        } else {
            System.out.println("Hababam Sınıfı Sınıfta Kaldı! ");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println("==============================");
        System.out.println(this.c1.name + "Notu: " + (this.c1.note * 8.0 / 10 + this.c1.optionNote * 2.0 / 10)/3.0);
        System.out.println(this.c2.name + "Notu: " + (this.c2.note * 8.0 / 10 + this.c2.optionNote * 2.0 / 10)/3.0);
        System.out.println(this.c3.name + "Notu: " + (this.c3.note * 8.0 / 10 + this.c3.optionNote * 2.0 / 10)/3.0);
        System.out.println("Ortalamanız: " + this.average);
    }
}
