package wrapperClasses;

public class WrapperClassDemo {
    
    public static void main(String[] args) {
        
        // 1. Primitive data types
        int a = 5;
        char ch = 'A';
        boolean flag = true;

        // 2. Boxing: Primitive -> Object (Wrapper)
        Integer aObj = Integer.valueOf(a);
        Character chObj = Character.valueOf(ch);
        Boolean flagObj = Boolean.valueOf(flag);

        System.out.println("Boxing (primitive to object):");
        System.out.println("Integer object: " + aObj);
        System.out.println("Character object: " + chObj);
        System.out.println("Boolean object: " + flagObj);
        System.out.println();

        // 3. Unboxing: Object -> Primitive
        int a2 = aObj.intValue();
        char ch2 = chObj.charValue();
        boolean flag2 = flagObj.booleanValue();

        System.out.println("Unboxing (object to primitive):");
        System.out.println("int value: " + a2);
        System.out.println("char value: " + ch2);
        System.out.println("boolean value: " + flag2);
        System.out.println();

        // 4. Autoboxing (Java does it automatically)
        Integer num = 10;  // int -> Integer automatically
        Character letter = 'Z'; // char -> Character automatically

        System.out.println("Autoboxing:");
        System.out.println("Integer object: " + num);
        System.out.println("Character object: " + letter);
        System.out.println();

        // 5. Auto-unboxing
        int num2 = num;  // Integer -> int automatically
        char letter2 = letter; // Character -> char automatically

        System.out.println("Auto-unboxing:");
        System.out.println("int value: " + num2);
        System.out.println("char value: " + letter2);
        //<------------------------------Some methods---------------------------------------->
     
        // 1. parseInt() - Convert String to int
        String strNumber = "100";
        int number = Integer.parseInt(strNumber);
        System.out.println("Using parseInt(): String to int = " + number);

        // 2. valueOf() - Convert String to Integer object
        String strValue = "200";
        Integer integerObject = Integer.valueOf(strValue);
        System.out.println("Using valueOf(): String to Integer object = " + integerObject);

        // 3. toString() - Convert Integer object to String
        String stringFromInteger = integerObject.toString();
        System.out.println("Using toString(): Integer object to String = " + stringFromInteger);

        // 4. compareTo() - Compare two Integer objects
        Integer first = 50;
        Integer second = 75;
        int comparisonResult = first.compareTo(second);
        
        System.out.print("Using compareTo(): ");
        if (comparisonResult == 0) {
            System.out.println(first + " is equal to " + second);
        } else if (comparisonResult > 0) {
            System.out.println(first + " is greater than " + second);
        } else {
            System.out.println(first + " is less than " + second);
        }
    }}

