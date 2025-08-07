package Generics;

import java.util.ArrayList;

class Box<T extends Number>//Bounded type parameters
{
T value;

public T getValue() {
    return value;
}

public void setValue(T value) {
    this.value =  value;
}


}

public class Main {
    public static void main(String[] args) {
            Box<Integer>b = new Box<>();
            b.setValue(2);
            int i = (Integer)b.getValue();
            System.out.println(i);
        Box<Double> d = new Box<>();
    }
}