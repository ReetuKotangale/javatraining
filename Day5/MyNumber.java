package Day5;

public class MyNumber {
    private int value;

    public MyNumber(int value) {
        this.value=value;
    }

    public boolean isPrime() {
        for(int i=2;i<=value-1;i++){
            if(value % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumUpToValue() {
        int sum=0;
        for(int i=1;i<=value;i++){
            sum= sum + i;
        }
        return sum;
    }

    public int sumOfDivisors() {
        int sum=0;
        for(int i=2;i<=value-1;i++){
            if(value % i == 0){
                sum=sum+i;
            }
        }
        return sum;
    }

    public void printNumberTriangle() {
        for(int i=1;i<=value;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }
    }
}
