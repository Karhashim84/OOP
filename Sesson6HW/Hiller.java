package Sesson6HW;

public class Hiller extends Vocation{
    public static String name = "Хиллер";

    public Hiller() {
        super(name);
    }

    @Override
    public String move() {
        return name + " Находиться в тылу и лечит отряд";
    }

    @Override
    public String weapon() {
        return name + " Использует жезл";
    }

    @Override
    public String armor() {
        return name + " Одевается в тканевую одежду";
    }
}
