package InheritanceEx;

public class child extends parent {
    public child(String name, int age){
        super(name , age);
        System.out.println("child is called");
    }
    public static void childMethod(){
       
        System.out.println("Child method called");
    }
    @Override // it is a annotation
        public void sayHello(){
        System.out.println("child says hi");
    }
}
