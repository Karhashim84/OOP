package HW2;

public class Chicken extends Bird implements BirdFly{
    protected Chicken(int height, int weight, String colorEye, int hightFly) {
        super(height, weight, colorEye, hightFly);
    }
    @Override
    public void toFly() {
        System.out.printf("Я лечу на %d метрах", super.getHightFly());
    }
    @Override
    public void animalSay() {
        System.out.println("Курица сказала - Куткудах");
    }
    @Override
    public String toString() {
        return String.format("Курица; %s", super.toString());
    }
}
