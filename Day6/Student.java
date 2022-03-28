package Day6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String name;
    private ArrayList<Integer> marks=new ArrayList<Integer>();//int marks

    public Student(String name, int... marks) {
        this.name=name;
        for(int mark:marks){
            this.marks.add(mark);
        }//this.marks=marks
    }

    public int getNumberOfMarks() {

        return marks.size();//for array marks.length
    }

    public int getTotalSumOfMarks() {
        int sum=0;
        for(int allNumber:marks) {
            sum = sum + allNumber;
        }
        return sum;
    }

    public int getMaximumMarks() {
        return Collections.max(marks);

        /*int maximum = 0;
        for (int mark : marks) {
            if (mark > maximum) {
                maximum = mark;
            }

        }
        return maximum;*/
    }

        public int getMinimumMarks() {
            int minimum = Integer.MAX_VALUE;
            for (int mark : marks) {
                if (mark < minimum) {
                    minimum = mark;
                }

            }
            return minimum;

        }

    public BigDecimal getAverageMarks() {
        BigDecimal avg;
        avg= new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(getNumberOfMarks()),4, RoundingMode.UP);//rounding upto 4 decimal
        return avg;
    }
    //for arraylist
    public String toString(){
        return name + marks;
    }

    public void addNewMark(int mark) {
        marks.add(mark);
    }

    public void removeMarkAtIndex(int index) {
        marks.remove(index);
    }
}

