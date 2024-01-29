package Sesson7HW;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            double primaryArg = promptInt("Введите первый аргумент: ");
            Calculable calculator = calculableFactory.create(primaryArg, true);
            while (true) {
                String cmd = prompt("Введите команду (*, +, -, /, =) : ");
                if (cmd.equals("*")) {
                    double arg = promptInt("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    double arg = promptInt("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("-")) {
                    double arg = promptInt("Введите второй аргумент: ");
                    calculator.minus(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    double arg = promptInt("Введите второй аргумент: ");
                    if (arg != 0) {
                        calculator.division(arg);
                    } else {
                        throw new ArithmeticException("Деление на ноль!");
                    }
                    continue;
                }
                if (cmd.equals("=")) {
                    double result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
