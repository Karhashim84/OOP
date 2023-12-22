public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Абстрактный метод для издания звука
    public abstract void makeSound();

    // Общий метод для всех животных
    public void eat() {
        System.out.println(name + " ест.");
    }

    // Геттеры и сеттеры для имени и возраста
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
