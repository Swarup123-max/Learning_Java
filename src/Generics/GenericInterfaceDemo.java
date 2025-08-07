package Generics;
// Generic interface
interface Processor<T> {
    void process(T input);
}

// Implementation for String type
class StringProcessor implements Processor<String> {
    @Override
    public void process(String input) {
        System.out.println("Processing string: " + input.toUpperCase());
    }
}

// Implementation for Integer type
class IntegerProcessor implements Processor<Integer> {
    @Override
    public void process(Integer input) {
        System.out.println("Processing integer: " + (input * 2));
    }
}

// Main class to demonstrate usage
public class GenericInterfaceDemo {
    public static void main(String[] args) {
        Processor<String> stringProcessor = new StringProcessor();
        stringProcessor.process("hello generics");

        Processor<Integer> integerProcessor = new IntegerProcessor();
        integerProcessor.process(25);
    }
}
