package Applications.KitapSiralayici;

import java.util.TreeSet;

/*
Kitap Sıralayıcı


Book isminde bir sınıf tasarlayınız.
Bu sınıf Comparable interface'den kalıtım alıp "compareTo" metodunu override ediniz.
Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız.
Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.
Sonra ikinci kez Set tipinden bir veri yapısı kullanın
ve kitapları sayfa sayısına göre sıralamasını sağlayınız.


Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.
 */
public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books =  new TreeSet<>(new OrderAlphabeticComparator());


        books.add(new Book("Satranç",100,"Stefan Zweig","1990"));
        books.add(new Book("Harry Potter",400,"J. K. Rowling","1984"));
        books.add(new Book("Gece Yarısı Kütüphanesi",300,"Matt Haig","1950"));
        books.add(new Book("Simyacı",350,"Paulo Coelho ","1920"));
        books.add(new Book("Hayvan Çiftliği",200,"George Orwell ","1910"));

        //İsme Göre Sıralama
        for (Book i :books ){
            System.out.println(i.getName());
        }



        System.out.println( "_____________________________");

        TreeSet<Book> books2 =  new TreeSet<>(new OrderPageNumberComparator());
        books2.add(new Book("Satranç",100,"Stefan Zweig","1990"));
        books2.add(new Book("Harry Potter",400,"J. K. Rowling","1984"));
        books2.add(new Book("Gece Yarısı Kütüphanesi",300,"Matt Haig","1950"));
        books2.add(new Book("Simyacı",350,"Paulo Coelho ","1920"));
        books2.add(new Book("Hayvan Çiftliği",200,"George Orwell ","1910"));



        //Sayfa Sayısına Göre Sıralama
        for (Book j : books2){
            System.out.println(j.getName());
        }
    }
}
