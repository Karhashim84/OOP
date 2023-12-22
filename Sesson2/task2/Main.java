// Главный класс
public class Main {
    public static void main(String[] args) {
        // Создаем объекты разных видов животных
        Animal dog = new Dog("Барсик", 3);
        Animal cat = new Cat("Мурзик", 2);
        Animal parrot = new Parrot("Кеша", 5);

        // Вызываем методы для каждого животного
        dog.makeSound();
        cat.makeSound();
        parrot.makeSound();

        dog.eat();
        cat.eat();
        parrot.eat();
    }
}