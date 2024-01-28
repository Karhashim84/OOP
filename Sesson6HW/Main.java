package Sesson6HW;

public class Main {
    public static void main(String[] args) {
        Vocation[] vocations = new Vocation[6];
        vocations[0] = new Tank();
        vocations[1] = new Hiller();
        vocations[2] = new Hunter();
        vocations[3] = new Mag();
        vocations[4] = new Killer();
        vocations[5] = new Warrior();
        
        for (Vocation v: vocations) {
            System.out.println("Специализация: " + v.getName());
        }
        System.out.println();

        VocationManager vocationManager = new VocationManager();

        for (Vocation v: vocations) {
            vocationManager.setVocation(v);
            System.out.println("Местоположение: " + vocationManager.checkAlife());
            System.out.println("Роль в команде: " + vocationManager.moveVocation());
            System.out.println("Снаряжение: " + vocationManager.weaponVocation());
            System.out.println("Снаряжение: " + vocationManager.armorVocation());
            System.out.println("Действие: " + vocationManager.attackVocation());
            System.out.println("Местоположение: " + vocationManager.checkAlife());
            System.out.println();
        }

        System.out.println();
        MovableManager movableManager = new MovableManager();

        Movable[] movables = new Movable[6];
        movables[0] = new Tank();
        movables[1] = new Hiller();
        movables[2] = new Hunter();
        movables[3] = new Mag();
        movables[4] = new Killer();
        movables[5] = new Warrior();
        
        for (Movable m: movables) {
            movableManager.setMovable(m);
            System.out.println("Роль в команде: " + movableManager.moveObject());
        }
    }
}