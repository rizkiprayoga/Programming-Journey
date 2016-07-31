
package dictionarypractice;

import java.util.HashMap;
import java.util.Map;


public class DictionaryPractice {

    public static void main(String[] args) {
        // English to spanish dictionaries
        Map<String, String> engSpanDictionary = new HashMap<String, String>();
        // Putting things inside our dictionary
        engSpanDictionary.put("Monday", "Lunes");
        engSpanDictionary.put("Tuesday", "Martes");
        engSpanDictionary.put("Wednesday", "Miércoles");
        engSpanDictionary.put("Thursday", "Jueves");
        engSpanDictionary.put("Friday", "Viernes");
        engSpanDictionary.put("Saturday", "Sábado");
        engSpanDictionary.put("Sunday", "Domingo");
        // Retrieve things from our dictionary
        System.out.println(engSpanDictionary.get("Monday"));
        System.out.println(engSpanDictionary.get("Tuesday"));
        System.out.println(engSpanDictionary.get("Wednesday"));
        System.out.println(engSpanDictionary.get("Thursday"));
        System.out.println(engSpanDictionary.get("Friday"));
        // Retrieve all keys from our dictionary
        System.out.println(engSpanDictionary.keySet());
        // Retrieve all values from our dictionary
        System.out.println(engSpanDictionary.values());
        // Retrieve the size of the dictionary
        System.out.println("The size of our dictionary is " + engSpanDictionary.size());
        
        System.out.println();
        System.out.println();
        
        // Shopping List
        // Boolean is an object, boolean is primitive data type, primitive data type doesn't have address
        Map<String, Boolean> shoppingList = new HashMap<String,Boolean>();
        shoppingList.put("Chicken", false);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreo", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", Boolean.TRUE);
        // Key-values dictionay print out
        System.out.println(shoppingList.toString());
        // Is Empty
        System.out.println(shoppingList.isEmpty());
        // Remove things
        shoppingList.remove("Eggs");
        System.out.println(shoppingList.toString());
        // Replace things
        shoppingList.replace("Bread", Boolean.FALSE);
        System.out.println(shoppingList.toString());
        // Clear Dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.isEmpty());
        Map<String, Integer> phoneBook = new HashMap<String,Integer>();
        
        System.out.println(engSpanDictionary.get("a"));
    }
    
}
