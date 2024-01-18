package Sesson4.task6;

import java.util.List;

class AnimalService {
    static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }

    public static void main(String[] args) {
        List<Animal> animalList = List.of(new Dog(), new Cat());
        List<Dog> dogList = List.of(new Dog(), new Dog());
        List<Cat> catList = List.of(new Cat(), new Cat());

        // Допустимые вызовы метода printAnimals
        printAnimals(animalList);
        printAnimals(dogList);
        printAnimals(catList);

        // Недопустимый вызов метода printAnimals (fishList не соответствует ограничению)
        // List<Fish> fishList = List.of(new Fish(), new Fish());
        // printAnimals(fishList); // Ошибка компиляции
    }
}
