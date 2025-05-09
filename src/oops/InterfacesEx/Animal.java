package InterfacesEx;

public interface Animal {
  // public  abstract void eating();no need to write final static or abstract
   // Abstract methods (no implementation)
    void eat();    // Method for eating
   void sleep();  // Method for sleeping
   int a=10;
   static void sleeping(){
    System.out.println("Animal is sleeping");
   }
   default void running()//can,t access by class name you have to make obj of sub class
   {
    System.out.println("Animal is running");
   }
}
