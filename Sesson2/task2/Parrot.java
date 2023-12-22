// Конкретный подкласс - попугай
public class Parrot extends Animal {
    public Parrot(String name, int age) {
        super(name, age);
    }

    // Реализация абстрактного метода makeSound для попугая
    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Привет, как дела?");
    }
}
