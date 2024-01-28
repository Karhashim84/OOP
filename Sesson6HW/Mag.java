package Sesson6HW;

public class Mag extends Vocation{
    public static String name = "Маг";

    public Mag() {
        super(name);
    }

    @Override
    public String move() {
        return name + " Находится на расстоянии являясь РДД";
    }

    @Override
    public String weapon() {
        return name + " Использует посох";
    }
    
    @Override
    public String armor() {
        return name + " Одевается в тканевую одежду";
    }
}
