package Sesson6HW;

public class Warrior extends Vocation {
    public static String name = "Воин";

    public Warrior() {
        super(name);
    }

    @Override
    public String move() {
        return name + " Находиться на передовой, является мили ДД";
    }

    @Override
    public String weapon() {
        return name + " Использует мечи/булавы/алебарду/копье";
    }
    
    @Override
    public String armor() {
        return name + " Одевается в латы";
    }
}