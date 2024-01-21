package Sesson6.task8;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты управляемых устройств
        Switchable lightBulb = new LightBulb();
        Switchable fan = new Fan();

        // Создаем менеджера устройств
        DeviceManager deviceManager = new DeviceManager();

        // Подключаем лампочку и включаем ее
        deviceManager.setDevice(lightBulb);
        deviceManager.turnOnDevice(); // Включение лампочки

        // Переключаем на вентилятор и включаем его
        deviceManager.setDevice(fan);
        deviceManager.turnOnDevice(); // Включение вентилятора

        // Выключаем текущее устройство (вентилятор)
        deviceManager.turnOffDevice(); // Выключение вентилятора
    }
}
