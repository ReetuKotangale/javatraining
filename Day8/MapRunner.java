package Day8;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        String str="If at first you do not succeed try try again.";

        //to print count of a character
        Map<Character,Integer> occurance=new HashMap<>();//used to find the number of times elements are present

        char[] characters=str.toCharArray();//convert string into character

        for(char character:characters){        //characters stored in character
            Integer integer=occurance.get(character);
            if(integer==null){     //first character starts with 1
                occurance.put(character,1);
            }else{
                occurance.put(character,integer+1);
            }
        }
        System.out.println(occurance);

        //to count words
        Map<String,Integer> stringOccurance=new HashMap<>();

        String[] words=str.split(" ");

        for(String store:words){
            Integer integer=stringOccurance.get(store);
            if(integer==null){
                stringOccurance.put(store,1);
            }else{
                stringOccurance.put(store,integer+1);
            }
        }
        System.out.println(stringOccurance);
    }


}

