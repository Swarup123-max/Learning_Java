package innerClasses;

public class test {
   public static void main(String[] args) {
    Car c1 = new Car("Tata Safari");
    Car.Engine engine = c1.new Engine();
     engine.start();
     engine.stop();
   }
}
