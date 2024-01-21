package Sesson6.task8;

class Fan implements Switchable {
    @Override
    public void turnOn() {
        // Логика включения вентилятора
        System.out.println("Включилась вентилятор");
    }

    @Override
    public void turnOff() {
        // Логика выключения вентилятора
        System.out.println("Выключился вентилятор");
    }
}
