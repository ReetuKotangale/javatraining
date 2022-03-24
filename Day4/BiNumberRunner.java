package Day4;

public class BiNumberRunner {

    public static void main(String args[]){

        BiNumber number= new BiNumber(2,6);
        System.out.println("The number of addition is: "+number.add());//6+2
        System.out.println("The number of multiplication is: "+number.multiply());//6*2
        number.doubleTheValue();
        System.out.println(number.getNumber1());//getNumber1=4
        System.out.println(number.getNumber2());//getNumber2=12

    }
}
