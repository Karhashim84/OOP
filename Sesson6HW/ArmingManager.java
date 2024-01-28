package Sesson6HW;

public class ArmingManager {
    private Arming arming;

    public void setMovable(Arming arming) {
        this.arming = arming;
    }

    String moveObject() {
        return arming.weapon();
    }
}
