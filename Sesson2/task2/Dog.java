// Конкретный подкласс - собака
public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    // Реализация абстрактного метода makeSound для собаки
    @Override
    public void makeSound() {
        System.out.println(getName() + " лает: Гав-гав!");
    }
}
