package Generics;

public class GenericsConstructors {
  private Object value;
    public <T> GenericsConstructors(T value){
       this.value=value;
    }
    @Override
    public String toString(){
        return String.valueOf(value);
    }
    public static void main(String[] args) {
         GenericsConstructors g1 = new GenericsConstructors("Hello");
         System.out.println(g1.toString());
    }
}
