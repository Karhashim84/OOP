package Sesson6HW;

public class Hunter extends Vocation {
    public static String name = "Охотник";

    public Hunter() {
        super(name);
    }

    @Override
    public String move() {
        return name + " Находится на расстоянии являясь РДД";
    }

    @Override
    public String weapon() {
        return name + " Использует лук/арбалет";
    }
    
    @Override
    public String armor() {
        return name + " Одевается в кльчужную броню";
    }
}
