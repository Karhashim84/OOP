package task1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void speak() {
        System.out.println("собака" + super.getName() + "гавкает");
    }
}

