package Sesson7HW;

public class LoggableCalculator implements Calculable{

    protected Calculable calc;
    Loggable calcLogger = new CalcLogger();


    public LoggableCalculator(Calculable calc) {
        calcLogger.saveLog("" + calc.getResult());
        this.calc = calc;
    }

    @Override
    public Calculable sum(double arg) {
        calcLogger.saveLog(calc.getResult() + " + " + arg);
        return this.calc.sum(arg);
    }

    @Override
    public Calculable multi(double arg) {
        calcLogger.saveLog(calc.getResult() + " * " + arg);
        return this.calc.multi(arg);
    }

    @Override
    public Calculable minus(double arg) {
        calcLogger.saveLog(calc.getResult() + " - " + arg);
        return this.calc.minus(arg);
    }

    @Override
    public Calculable division(double arg) {
        calcLogger.saveLog(calc.getResult() + " / " + arg);
        return this.calc.division(arg);
    }

    @Override
    public double getResult() {
        double result = this.calc.getResult();
        calcLogger.saveLog(" = " + result);
        return this.calc.getResult();
    }
}
