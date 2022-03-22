package Uygulamalar.Siniflar.NotSistemi;
/*
Öğrenci Not Sistemi
Course Sınıfı Özellikleri :

Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()
Teacher Sınıfı Özellikleri :

Nitelikler : name,mpno,branch
Metotlar : Teacher()
Student Sınıfı Özellikleri :

Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

Course sınıfına derse ait sözlü notu kısmını girin ve
ortalamaya etkisini her ders için ayrı ayrı belirtin.
Sözlü notlarınıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
 */

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "539666666");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "05344646");
        Teacher t3 = new Teacher("Külturmaz", "BIYO", "185151");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        tarih.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101", "BOYO");
        tarih.addTeacher(t3);



       Student s1 = new Student("İnek Şaban", "123","4",tarih, fizik, biyo);
       s1.addBulkExamNote(100,70,50,10,10,10);
       s1.printNote();
       s1.isPass();

       Student s2 = new Student("Güdük Necmi", "444","4",tarih,fizik,biyo);
       s2.addBulkExamNote(50,30,70,20,10,10);
       s2.isPass();


    }
}
