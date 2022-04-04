package Applications.ThreadYarisi;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>(25);
        ArrayList<Integer> list2 = new ArrayList<>(25);
        ArrayList<Integer> list3 = new ArrayList<>(25);
        ArrayList<Integer> list4 = new ArrayList<>(25);

        for (int i =1; i<=100; i++){
            list.add(i);
        }

        list1.addAll(list.subList(0,25));
        list2.addAll(list.subList(25,50));
        list3.addAll(list.subList(50,75));
        list4.addAll(list.subList(75,100));

        Odd o1 = new Odd(list1);
        Thread t1 = new Thread(o1);
        t1.start();

        Even e1 = new Even(list2);
        Thread t2 = new Thread(e1);
        t2.start();
    }
}
