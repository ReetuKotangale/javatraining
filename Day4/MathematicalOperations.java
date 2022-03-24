package Day4;

import java.util.Scanner;

public class MathematicalOperations {
    int number1;
    int number2;

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value1");
        int number1=sc.nextInt();
        System.out.println("enter value2");
        int number2=sc.nextInt();
        System.out.println("choose the number operation you want to perform");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divide");
        System.out.println("enter your choice");
        int operation=sc.nextInt();

        System.out.println("Value1 is: "+number1);
        System.out.println("Value2 is: "+number2);
        System.out.println("your choice is: "+operation);

        if(operation==1){
            System.out.println("the addition is:"+(number1+number2));
        }
        if(operation==2){
            System.out.println("the subtraction is:"+(number1-number2));
        }
        if(operation==3){
            System.out.println("the multiplication is:"+(number1*number2));
        }if(operation==4){
            System.out.println("the divide is:"+(number1/number2));
        }



    }
}
