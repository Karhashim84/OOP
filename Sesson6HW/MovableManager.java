package Sesson6HW;

public class MovableManager {
    private Movable movable;

    public void setMovable(Movable movable) {
        this.movable = movable;
    }

    String moveObject() {
        return movable.move();
    }
}

