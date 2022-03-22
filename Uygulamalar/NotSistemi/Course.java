package Uygulamalar.Siniflar.NotSistemi;

public class Course {

    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;
    int optionNote;



    // Teacher sınıfını Course Sınıfı içerisine atayhabiliriz.
    // Bir sınıfın niteliğine başka bir sınıfa ait nitelik tanımlayabiliriz.

    // Derse teacher atayacağımız için tacher sınıfından atama yapıyoruz.

    Course(String name, String code, String prefix) {// teacher teacher'dan üretilecek olan nesneyi tanımlar
    this.name = name;
    this.code = code;
    this.prefix = prefix;
    this.teacher = teacher;
    int note = 0;
    this.optionNote = optionNote;

    }

    //teacher Sınıfındaki tüm özellikelr buradaki Teacher nesnesine taşındı. Buradanda Main'e taşınacak
    void addTeacher(Teacher teacher) {
        //Stringlerde == yerine equals() kullanılır.
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacher();
        }
        else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor! ");
        }

    }
    void printTeacher(){

        //üstte alınan teacher'ın print'ini çalıştıracak
        this.teacher.print();
    }

}
