package Sesson6HW;

public class ArmoringManager {
    private Armoring armoring;

    public void setMovable(Armoring armoring) {
        this.armoring = armoring;
    }

    String moveObject() {
        return armoring.armor();
    }
}
