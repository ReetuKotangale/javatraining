package Abstract;

public class Cat extends AnimalAbstract{
    public void bark(){
        System.out.println("meow meow");
    }

    public static void main(String[] args) {
        AnimalAbstract[] animal={new Dog(),new Cat()};
        for(AnimalAbstract animals:animal){
            animals.bark();
        }
    }
}
