package Applications.ThreadYarisi;

import java.util.ArrayList;

public class Even implements Runnable{
    public ArrayList<Integer> list;
    ArrayList<Integer> evenList = new ArrayList<>();

    public Even(ArrayList<Integer> list){
        this.list=list;
    }

    @Override
    public void run(){
        for (int i = 0; i < list.size();i++){
            if (list.get(i) %2 ==0){
                evenList.add(list.get(i));
            }
        }
        System.out.println(evenList.toString());
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    public ArrayList<Integer> getEvenList() {
        return evenList;
    }

    public void setEvenList(ArrayList<Integer> evenList) {
        this.evenList = evenList;
    }
}
