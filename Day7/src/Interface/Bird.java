package Interface;

public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird fly with wings");
    }

    public static void main(String[] args) {
        Flyable[] flyable={new Bird(),new Aeroplane()};
        for(Flyable objects:flyable){
            objects.fly();

        }
    }
}
