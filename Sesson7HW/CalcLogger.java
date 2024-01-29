package Sesson7HW;

public class CalcLogger implements Loggable{
    @Override
    public void saveLog(String str) {
        System.out.println("Результат: " + str);
    }
}
