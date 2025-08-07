package Exception_Handling;

import AccessModifiers.access2.student;
import InterfacesEx.multipleInheritance.smartphone;

public class ex {
    public static void main(String[] args) {
        int[] numerator = { 100, 200, 300, 400 };
        int[] dinominator = { 100, 30, 0, 400 };
        
            try{
                for (int i = 0; i < 10; i++) {
           div(numerator[i], dinominator[i]);
            }
        }catch(Exception e){
                System.out.println(e);

            }

        }
    

    static void div(int a, int b)  {
        try { 
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e);
           
        }
        catch(NullPointerException e ){
            System.out.println(e);
            
        }
           

    }
}
