package Applications.BookList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Books> books = new ArrayList<>();

        books.add(new Books("X Kitabı", 100, "X Yazarı", "05,05,1905"));
        books.add(new Books("Y Kitabı", 101, "Y Yazarı", "01.01.1991"));
        books.add(new Books("Z Kitabı", 102, "Z Yazarı", "02.02.1992"));
        Map<String, String> mappedList = new TreeMap<String, String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        books.forEach(i -> {
            mappedList.put(i.getName(), i.getWriter());
        });

        ArrayList<Books> pageSizeOneHundered = new ArrayList<>();

        books.stream().forEach(i -> {
            if (i.getPageNumber() > 100) {
                pageSizeOneHundered.add(i);
            }
        });

        mappedList.forEach((i, v) -> System.out.println(i + " : " + v));


    }
}
