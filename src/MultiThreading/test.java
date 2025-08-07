package MultiThreading;

public class test{
    public static void main(String[] args) {
        System.err.println("Hello world");
        System.out.println(Thread.currentThread().getName());
           world w = new world();
        
        w.stop();
        for (int i = 0; i < 1000000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
     
    }
}
