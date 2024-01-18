package Sesson4.task4;

public class NumericFns <T extends Number> {
    T num;

    // Конструктор класса NumericFns, принимающий числовый объект типа T.
    NumericFns(T n) {
        num = n;
    }

    // Метод для возврата абсолютного значения числа.
    double absValue() {
        return Math.abs(num.doubleValue());
    }

    // Проверка абсолютного равенства двух объектов NumericFns.
    boolean absEqual(NumericFns<?> ob) {
        return this.absValue() == ob.absValue();
    }
}
