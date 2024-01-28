package Sesson6HW;

public class VocationManager {
    private Vocation vocation;

    public void setVocation(Vocation vocation) {
        this.vocation = vocation;
    }

    String moveVocation() {
        return vocation.move();
    }

    String weaponVocation() {
        return vocation.weapon();
    }

    String armorVocation() {
        return vocation.armor();
    }

    String attackVocation() {
        return vocation.attack();
    }

    String checkAlife() {
        return vocation.isAlife ? vocation.getName() + " В поиске приключений" : vocation.getName() + " находится в таверне";
    }
}

