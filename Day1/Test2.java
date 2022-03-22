public class Test2 {
    public static void main(String arg[]){
        //print 1 to 10
        System.out.println("print numbers 1 to 10");
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("print numbers 10 to 1");
        //print 10 to 1
        for(int i=10; i>=1; i--){
            System.out.println(i);
        }
        //print odd number
        System.out.println("print odd numbers");
        for(int i=1; i<=9; i=i+2){
            System.out.println(i);
        }
        System.out.println("print even numbers");
        //print even number
        for(int i=2; i<=10; i=i+2){
            System.out.println(i);
        }
        System.out.println("print squares");
        //print squares
        for(int i=2; i<=20; i++){
            System.out.println(i*i);
        }

    }
}
