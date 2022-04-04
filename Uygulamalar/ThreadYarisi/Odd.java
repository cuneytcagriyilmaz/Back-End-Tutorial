package Applications.ThreadYarisi;

import java.util.ArrayList;

public class Odd implements Runnable {
    public ArrayList<Integer> list;

    ArrayList<Integer> oddList = new ArrayList<>();

    public Odd(ArrayList<Integer> list) {
        this.list = list;

    }

    @Override
    public void run() {
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                oddList.add(integer);
            }
        }
        System.out.println(oddList.toString());
    }


    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    public ArrayList<Integer> getOddList() {
        return oddList;
    }

    public void setOddList(ArrayList<Integer> oddList) {
        this.oddList = oddList;
    }
}
