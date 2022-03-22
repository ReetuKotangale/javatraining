import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {

    public static void main(String arg[]){



        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int i=sc.nextInt();

        for(int j=1; j<=10; j++){
            System.out.printf("%d * %d = %d",i,j,i*j).println();
        }





    }
}

