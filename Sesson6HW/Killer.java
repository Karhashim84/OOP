package Sesson6HW;

public class Killer extends Vocation{
    public static String name = "Убийца";

    public Killer() {
        super(name);
    }

    @Override
    public String move() {
        return name + " Находиться за спиной врага, являясь РДД";
    }

    @Override
    public String weapon() {
        return name + " Использует кинжалы";
    }
    
    @Override
    public String armor() {
        return name + " Одевается в кожанную броню";
    }
}