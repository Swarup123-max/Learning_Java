package constructorex;

public class student {

    private String name;
    private int age;
    private int regdNo;

    // public student(int age, String name, int regdNo) {//A constructor is used to initialize an object at the time of creation.
    //     this.age = age;
    //     this.name = name;
    //     this.regdNo = regdNo;
    // }
    
    public student(){
        this.age=10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public  void setAge(int age) {
        this.age = age;
    }

    public int getRegdNo() {
        return regdNo;
    }

    public void setRegdNo(int regdNo) {
        this.regdNo = regdNo;
    }

}

