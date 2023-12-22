// Конкретный подкласс - кошка
public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    // Реализация абстрактного метода makeSound для кошки
    @Override
    public void makeSound() {
        System.out.println(getName() + " мяукает: Мяу-мяу!");
    }
}
