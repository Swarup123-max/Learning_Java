package Generics;

import java.util.ArrayList;
import java.util.List;

// Generic Class
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void showType() {
        System.out.println("Type of T: " + value.getClass().getName());
    }
}

// Generic Method
class Util {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Bounded Type Parameter
    public static <T extends Number> double sumOfList(List<T> list) {
        double sum = 0.0;
        for (T element : list) {
            sum += element.doubleValue();
        }
        return sum;
    }

    // Using wildcard '?'
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    // Lower Bounded Wildcard '? super T'
    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        // Generic class example
        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        intBox.showType();
        System.out.println("Value: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Generics in Java");
        strBox.showType();
        System.out.println("Value: " + strBox.get());

        // Generic method
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generics", "Demo"};

        System.out.print("Integer Array: ");
        Util.printArray(intArray);

        System.out.print("String Array: ");
        Util.printArray(strArray);

        // Bounded type example
        List<Integer> intList = List.of(10, 20, 30);
        System.out.println("Sum of intList: " + Util.sumOfList(intList));

        List<Double> doubleList = List.of(2.5, 3.5, 4.0);
        System.out.println("Sum of doubleList: " + Util.sumOfList(doubleList));

        // Wildcard examples
        List<String> names = List.of("Alice", "Bob", "Charlie");
        System.out.print("Names List: ");
        Util.printList(names);

        List<Object> objects = new ArrayList<>();
        Util.addIntegers(objects);
        System.out.print("Objects after adding integers: ");
        Util.printList(objects);
    }
}
