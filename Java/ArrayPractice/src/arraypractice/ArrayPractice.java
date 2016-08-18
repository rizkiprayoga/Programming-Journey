
package arraypractice;

import java.util.Arrays;


public class ArrayPractice {
    
    public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++){
        int item = array[i];
        System.out.print(item);
        if(i < array.length - 1){
            System.out.print(", ");
        }
    } 
        System.out.println("]");
    }
    
    public static void printArray(String[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++){
        String item = array[i];
        System.out.print(item);
        if(i < array.length - 1){
            System.out.print(", ");
        }
    } 
        System.out.println("]");
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // index : 0 1 2 3 4
        // Array : 5 7 2 4 1 <- length 5
        
        // Declaring, Allocating, and Initializing
        
        int[] intArray1;
        int[] intArray2 = new int[4];
        int[] intArray3 = {5,6,1,3,7};
        
        String[] stringArray1 = {"oncom", "tahu", "tempe"};
        
        // index : 0  1 2 3 
        // Array : 10 7 2 4  <- length 4
        intArray2[0] = 10;
        intArray2[1] = 7;
        intArray2[2] = 2;
        intArray2[3] = 4;
        
        //Print Arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();
        
        //Custom printout Arrays
        printArray(intArray2);
        printArray(intArray3);
        System.out.println();
        
        //Retrieve objects
        System.out.println(intArray3[3]);
        System.out.println();
        
        //Given function
        Arrays.sort(intArray3);
        printArray(intArray3);
        
        //Print string array
        printArray(stringArray1);
        
        System.out.println("Special For Loop: ");
        //Special for loop : foreach
        for (String s : stringArray1){
            System.out.println(s);
        }
    }
    
}
