
package StaticKeyWord;
public class Student {
 public static int count =0;
    private int id;
    private int age;
    private String name;
    public Student(){
          count ++; 
    }
static{
    System.out.println("hello");
}
    public int getId() {
        return id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
