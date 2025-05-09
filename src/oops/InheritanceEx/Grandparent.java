package InheritanceEx;

public class Grandparent {
    private String name;
    private int age;
public Grandparent(String name, int age){
this.name= name;
this.age = age;
    
    System.out.println("Grandparent is called");
}
    public String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void sayHello(){
        System.out.println("grandparent says hi");
    }
    
}
