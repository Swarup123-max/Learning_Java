package MathClass;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int max = Math.min(a, b);
        int min = Math.max(max, b);
        Double d = 10.90;
       System.out.println( Math.ceil(d));
       System.out.println( Math.floor(d));
       System.out.println( Math.log10(d));
       System.out.println(Math.PI);
       System.out.println((int )(Math.random()*100+1));
       System.out.println(Math.nextAfter(1, 0));

    }
}
