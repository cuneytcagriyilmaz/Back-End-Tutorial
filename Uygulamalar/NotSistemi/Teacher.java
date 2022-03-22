package Uygulamalar.Siniflar.NotSistemi;

public class Teacher {
    String name;
    String mpno;
    String branch;

    //Constructer Mothod
    Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }


    void print() {
        System.out.println("Adı: : " + this.name);
        System.out.println("Telefonu : " + this.mpno);
        System.out.println("Bölümü : " + this.branch);
    }
}
