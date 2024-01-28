package Sesson7.task1;

public class Main {
    public static void main(String[] args) {
        // Получение единственного экземпляра Singleton.
        Singleton singleton = Singleton.getInstance();
        // Singleton singleton1 = new Singleton();
        Singleton singleton2 = Singleton.getInstance();

        // Вывод метода объекта Singleton.
        singleton.someMethod();

        System.out.println(singleton);
        System.out.println(singleton2);

        // Попытка создать еще один экземпляр Singleton.
        // Этот код вызовет ошибку компиляции, так как конструктор Singleton приватный.
        // Singleton anotherInstance = new Singleton();
    }
}
