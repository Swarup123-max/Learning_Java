package Generics;

interface Printable {
    void print();
}

class MyNumber extends Number implements Printable {
    private final int value;

    public MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("My number " + value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }

}

// only extends keyword works here for interfaces also
class box<T extends Number & Printable> // imp syntax 1st should be class and second should be interfaces
{
    private T item;

    public box(T item) {
        this.item = item;
    }

    public void display() {
        item.print();
    }

    public T getItem() {
        return item;
    }
}

public class Test {
    public static void main(String[] args) {
        MyNumber obj = new MyNumber(11);
        box<MyNumber> b1 = new box<>(obj);
        b1.display();
    }
}
