import java.sql.SQLOutput;

public class Test3 {

    static void calculateAngleOfRactangle(int angle1,int angle2,int angle3){
        int angle=360-(angle1+angle2+angle3);
        System.out.println("Angle of ractangle: "+angle);
        //return angle;

    }
    static void calculateAreaOfTriangle(int base, int height){
        double area=0.5 * (base * height);
        System.out.println("The area of Triangle: "+area);
    }
    static void showTables(int tableNumber){
        for(int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d",i,tableNumber,i*tableNumber).println();
        }

    }

    public static void main(String args[]){
        calculateAngleOfRactangle(25,21,86);
        calculateAreaOfTriangle(25,32);
        showTables(5);


    }
}
