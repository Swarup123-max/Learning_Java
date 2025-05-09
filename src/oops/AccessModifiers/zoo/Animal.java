package AccessModifiers.zoo;

public class Animal {
    private String name;
    protected static   String Sound;

    public Animal(String Sound, String name) {
       this.Sound = Sound;
        this.name = name;
    }
    public void makeSound(){
        System.out.println(name+ "Makes a sound of " +Sound);
    }
    protected void changeSound(String newsound){
        this.Sound = newsound;
    }
    protected String getName(){
        return getClass().getSimpleName();
    }
   

}
