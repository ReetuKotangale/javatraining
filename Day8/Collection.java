package Day8;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<String> words=List.of("Rose","Tulip","Hibiscus","Daisy");//to create list

        for(int i=0;i< words.size();i++){
            System.out.println(words.get(i));
        }//print by for loop

        //System.out.println(words); //print list
        System.out.println("the size of list:"+words.size());
        List<String> linkList=new LinkedList<>(words);//new Vector,new ArrayList
        linkList.add("lotus");//add lotus
        System.out.println(linkList.size());//5
        linkList.remove(2);//remove hibiscus
        System.out.println(linkList);

        System.out.println(linkList.contains("Rose"));//true

        int n=10;
        List<Integer> number=new ArrayList<>();

        for(int i=1; i<=n;i++){
            number.add(i);
        }
        System.out.println(number);
    }
}
