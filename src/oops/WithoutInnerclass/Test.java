package WithoutInnerclass;

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("Tata");
        Engine e1 = new Engine(c1);
        e1.start();
        e1.stop();
    }
}
