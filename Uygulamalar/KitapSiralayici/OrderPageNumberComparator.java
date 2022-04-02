package Applications.KitapSiralayici;

import java.util.Comparator;

public class OrderPageNumberComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2){
        return b2.getSayfaSayisi()-b1.getSayfaSayisi();
    }
}
