package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog ("Барсик");
        Animal cat = new Dog ("Мурзик");
        Animal bird = new Dog ("Кеша");
        Animal animal = new Animal("Какое-то животное", 2);

        animalSpeaks(dog);
        animalSpeaks(cat);
        animalSpeaks(bird);
        ArrayList<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(bird);
        list.add(animal);
    }
    public static void animalSpeaks(Animal animal) {
        animal.speak();
    }
}
