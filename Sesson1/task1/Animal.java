package task1;

public class Animal {
    private String name;
    private int age;
    public Animal(String name) {
        this.name = name;
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void speak() {
        System.out.println(name + "издает звук.");
    }
    protected String getName() {
        return name;
    }
}
