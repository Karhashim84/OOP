package Sesson6.task8;

class DeviceManager {
    private Switchable device;

    void setDevice(Switchable device) {
        this.device = device;
    }

    void turnOnDevice() {
        device.turnOn();
    }

    void turnOffDevice() {
        device.turnOff();
    }
}
