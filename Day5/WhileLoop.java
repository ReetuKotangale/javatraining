package Day5;

public class WhileLoop {
    private int limit;

    public WhileLoop(int limit) {
        this.limit=limit;
    }

    public void printSquareUpToLimit() {
        int i=0;
        while(i*i<limit){
            System.out.println("the square is: "+(i*i));
            i++;
        }

    }
    public void printCubeUpToLimit(){
        int i=0;
        while(i*i*i<limit){
            System.out.println("the cube is: "+(i*i*i));
            i++;

        }
    }
}
