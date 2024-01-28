package Sesson6HW;

public abstract class Vocation implements Movable, Attacking, Arming, Armoring {
    private String name;
    boolean isAlife = true;

    public Vocation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String attack(){
        isAlife = false;
        return "Персонаж " + name + " атакует врага";
    }
}