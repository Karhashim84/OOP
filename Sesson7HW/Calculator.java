package Sesson7HW;

public final class Calculator implements Calculable {

    private double primaryArg;

    public Calculator(double primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(double arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculable multi(double arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public Calculable minus(double arg) {
        primaryArg -= arg;
        return this;
    }

    @Override
    public Calculable division(double arg) {
        primaryArg /= arg;
        return this;
    }

    @Override
    public double getResult() {
        return primaryArg;
    }
}
