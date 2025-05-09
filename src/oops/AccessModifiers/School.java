package AccessModifiers;

public class School {

    private static School instance;
     private School()//so that no one can make object outside the class
{
     }
     public static  School getInstance()//static is used so that we can call it by class reference
     {
        if(instance ==null)
        {
            instance = new School();//so that the object can be made once
        }
        return instance;
     }
}