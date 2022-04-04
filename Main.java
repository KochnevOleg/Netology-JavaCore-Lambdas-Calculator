package Unit2.JavaCore.Lambdas.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();

        int x = calculator.plus.apply(3,67);
        int y = calculator.divide.apply(190, 54);
        int z = calculator.pow.apply(4);
        int a = calculator.minus.apply(45,78);
        int b = calculator.abs.apply(-2);

        calculator.println.accept(b);
    }
}
