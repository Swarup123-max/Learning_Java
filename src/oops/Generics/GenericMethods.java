package Generics;

import java.util.Arrays;

class GenericMethods {
    /*
     * syntax-> access modifier <T> datatype methodname(T parameter){
     * //body
     * }
     */
    public static void main(String[] args) {

        GenericMethods g1 = new GenericMethods();
        Integer[] intArray = { 1, 2, 3, 4 };
        String[] strArray = { "hello", "nice", "to", "meet", "you" };
        g1.printArray(intArray);
        printArray(strArray);
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(array));
    }
}