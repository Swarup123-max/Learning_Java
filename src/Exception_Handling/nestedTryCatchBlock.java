package Exception_Handling;

public class nestedTryCatchBlock {
    public static void main(String[] args) {
        int [] arr = new int[5];

        try{
            // arr[6]=10;
        try {
            System.out.println(arr[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println(e);
             System.out.println("level2");
        }
         }catch(Exception e){
            System.out.println(e);
         }
        
        
}
}
