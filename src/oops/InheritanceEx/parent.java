package InheritanceEx;

public class parent extends Grandparent{
    
public parent(String name, int age){
    super(name, age);
    
    System.out.println("parent is called");
}
public void parentMethod(){
    System.out.println("parent method called");
}
@Override
public void sayHello(){
    System.out.println("parent says hi");
}

}
