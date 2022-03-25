package Day5;

import java.util.Scanner;

public class DoWhileRunner {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=0;
        do{
            if(number > 0){
                System.out.println(number*number*number);
            }
            System.out.println("enter the number: ");
            number= sc.nextInt();

        }while(number>=0);
        System.out.println("thank you");
    }
}
