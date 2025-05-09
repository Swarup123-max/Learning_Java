package WithoutInnerclass;

public class Car {
    private String model;
    public void setEngineOn(boolean isEngineOn) {
        this.isEngineOn = isEngineOn;
    }

    private boolean isEngineOn;

   String getModel() {
        return model;
    }

  public  Car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

   boolean isEngineOn() {
        return isEngineOn;
       
    }

     
}