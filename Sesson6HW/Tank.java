package Sesson6HW;

public class Tank extends Vocation{
    public static String name = "Танк";

    public Tank() {
        super(name);
    }

    @Override
    public String move() {
        return name + " Находиться на передовой, собирает агро на себя";
    }

    @Override
    public String weapon() {
        return name + " Использует меч/булаву";
    }
    
    @Override
    public String armor() {
        return name + " Одевается в латы и щит";
    }
}
