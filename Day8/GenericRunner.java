package Day8;

import java.util.ArrayList;
import java.util.List;

public class GenericRunner {

    static <Y> Y doubleValue(Y value){
        return value;
    }

    static <Y extends List>  void duplicate(Y list){
        list.addAll(list);
    }

    static double sumOfNumbers(List<? extends Number> numbers){ //upper bounded wild card=help to generate common logic
        double sum=0.0;
        for(Number num:numbers){
            sum += num.doubleValue();
        }
        return sum;
    } //lower bounded wild card

    static void addNumbers(List<? super Number> numbers){ //lower bounded wild card=to add the values of subtype of numbers
      numbers.add(25);
      numbers.add(2.8);
      numbers.add(8l);
      numbers.add(8.2f);
    }

    public static void main(String[] args) {
        String value1=doubleValue(new String());
        Integer num=doubleValue(Integer.valueOf(4));
        ArrayList arraylist=doubleValue(new ArrayList());

        ArrayList<String> values=new ArrayList<>(List.of("apple","banana","cat","dog"));
        duplicate(values);
        System.out.println(values);

        ArrayList<Integer> numbers=new ArrayList<>(List.of(21,4,54,7,3,88));
        doubleValue(numbers);
        System.out.println(numbers);

        System.out.println(sumOfNumbers(numbers));
        System.out.println(sumOfNumbers(List.of(20.1,4.2,54.2,7.2)));

        ArrayList array=new ArrayList<Number>();
        addNumbers(array);
        System.out.println(array);


        
    }
}
