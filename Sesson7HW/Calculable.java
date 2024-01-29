package Sesson7HW;

public interface Calculable {
    Calculable sum(double arg);
    Calculable multi(double arg);
    Calculable minus(double arg);
    Calculable division(double arg);
    double getResult();
}
