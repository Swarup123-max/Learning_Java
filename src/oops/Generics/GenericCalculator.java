package Generics;

enum Maths {
    ADD, SUB, MUL, DIV;

    public <T extends Number> Double calculator(T a, T b) {
        return switch (this) {
            case ADD -> a.doubleValue() + b.doubleValue();
            case SUB -> a.doubleValue() - b.doubleValue();
            case MUL -> a.doubleValue() * b.doubleValue();
            case DIV -> b.doubleValue() != 0 ? a.doubleValue() / b.doubleValue() : Double.NaN;//"Not a Number"
        };
    }
}

public class GenericCalculator {
    public static void main(String[] args) {
        System.out.println(Maths.ADD.calculator(10, 5));     // 15.0
        System.out.println(Maths.SUB.calculator(10, 5));     // 5.0
        System.out.println(Maths.MUL.calculator(10, 5));     // 50.0
        System.out.println(Maths.DIV.calculator(10, 0));     // NaN //"Not a Number"
    }
}
