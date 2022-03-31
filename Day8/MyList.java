package Day8;

import java.util.ArrayList;

public class MyList<T> {  //T=TYPE  T extends number
    ArrayList<T> list=new ArrayList<>();

    public void addElements(T element){
        list.add(element);
    }

    public void removeElements(T element){
        list.remove(element);
    }

    public String toString(){
        return list.toString();
    }

    public T get(int index) {
        return list.get(index);
    }
}
