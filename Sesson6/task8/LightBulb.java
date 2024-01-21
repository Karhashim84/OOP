package Sesson6.task8;

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        // Логика включения лампочки
        System.out.println("Включилась лампочка");
    }

    @Override
    public void turnOff() {
        // Логика выключения лампочки
        System.out.println("Выключилась лампочка");
    }
}