package Day9;

import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgramming {
    public static void main(String[] args) {
        List<String> list = List.of("red", "blue", "purple", "yellow", "green","orange");
        List<Integer> list1=List.of(1,23,5,7,4,56,4);
        //printBasic(list);
        printWithFP(list);
        System.out.println("words ends with e:-");
        endsWithE(list);
        System.out.println("the squares of integer:- ");
        squares(list1);
    }

        public static void printBasic(List<String> list){
            for(String print:list){
                System.out.println(print);
            }
        }

        public static void printWithFP(List<String> list){
            list.stream().forEach(element -> System.out.println(element));//foreach(action)
        }
        public static void endsWithE(List<String> list){
        list.stream().filter(element -> element.endsWith("e")).forEach(element -> System.out.println(element));

        }
        public static void squares(List<Integer> list1){
        list1.stream().map(e -> e * e).forEach(element -> System.out.println(element));
        }
    }

