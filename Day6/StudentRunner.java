package Day6;

import java.math.BigDecimal;
import java.util.ArrayList;

public class StudentRunner {


    public static void main(String args[]){
        int[] marks={24,58,65,43};

        Student student=new Student("anna",marks);
        int number=student.getNumberOfMarks();
        System.out.println("the length of number is: "+number);//count index number-3

        int sum =student.getTotalSumOfMarks();
        System.out.println("The sum of Marks is: "+sum);//24+58+65

        int maximum =student.getMaximumMarks();
        System.out.println("the maximum value:"+maximum);

        int min =student.getMinimumMarks();
        System.out.println("the minimum value:"+min);
        BigDecimal average=student.getAverageMarks();
        System.out.println("the average of marks:"+average);//getTotalSumOfMarks()/getNumberOfMarks()



        System.out.println(student);//print name+marks

        student.addNewMark(80);
        System.out.println(student);//add the marks
        student.removeMarkAtIndex(1);
        System.out.println(student);//remove the marks through index position


    }
}
