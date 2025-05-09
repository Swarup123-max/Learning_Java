package WithoutInnerclass;

public class Engine {
    private Car c1;

    public Engine(Car c1) {
        this.c1 = c1;
    }

    public void start() {
        if (!c1.isEngineOn()) {
            c1.setEngineOn(true);

            System.out.println(c1.getModel() + " engine started");
        } else {
            System.out.println(c1.getModel() + " engine is already on");

        }
    }

    public void stop() {
        if (c1.isEngineOn()) {
            c1.setEngineOn(false);
            System.out.println(c1.getModel() + " engine stopped");
        } else {
            System.out.println(c1.getModel() + " engine is already off");
        }
    }
}