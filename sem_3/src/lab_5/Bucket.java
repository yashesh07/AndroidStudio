package lab_5;

import java.util.ArrayList;

public class Bucket {

    public ArrayList<Integer> list = new ArrayList<>();

    public void append(int x){
        list.add(x);
    }

    public int getElement(){
        return list.get(0);
    }

    public void remove(){
        list.remove(0);
    }

    public int getSize(){
        return list.size();
    }
}
