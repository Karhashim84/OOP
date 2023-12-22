package task1;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void speak() {
        System.out.println("кошка" + super.getName() + "мяукает");
    }
}
