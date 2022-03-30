package Interface;

public class Aeroplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Aeroplane uses fuel");
    }
}
