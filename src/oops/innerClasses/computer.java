package innerClasses;
//Static nested class
public class computer {
    private String brand;
    private String model;
    private OperatingSystem os;

    public computer(String brand, String model, String os) {
        this.brand = brand;
        this.model = model;
        this.os = new  OperatingSystem(os);
    }
  
     public OperatingSystem getOs() {
        return os;
    }
    static class USB{
        private String type;

        public USB(String type) {
            this.type = type;
        }
        public void displayInfo(){
            System.out.println(type);
        }

    }

     class OperatingSystem{
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }
        public void displayInfo(){
            System.out.println("Computer Model : "+ model);
        }
     }
    
}
class test{
    public static void main(String[] args) {
        computer c1 = new computer("dell", "G15", "xyz");
        c1.getOs().displayInfo();
        computer.USB usb = new computer.USB("Ctype");
        usb.displayInfo();

    }
}
