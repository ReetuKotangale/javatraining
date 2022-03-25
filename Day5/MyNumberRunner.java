package Day5;

public class MyNumberRunner {
    public static void main(String args[]){
        MyNumber number=new MyNumber(8);
        boolean answer=number.isPrime();
        System.out.println("the number is prime: "+answer);
        int add=number.sumUpToValue();
        System.out.println("the addition of number up to given value "+add);
        int divisor=number.sumOfDivisors();
        System.out.println("sum of divisor"+divisor);
        number.printNumberTriangle();

    }
}
