
import java.util.Scanner;


public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt() % 11;
    String[] s = new String[T];
    for ( int i = 0; i < T; i++ ){
        s[i] = scanner.next();
    } 
    
    for ( int x = 0; x < T; x++){
        
        for ( int y = 0; y < s[x].length(); y = y + 2){
            System.out.print(s[x].charAt(y));
        }
        
        System.out.print(" ");
        
        for ( int y = 1; y < s[x].length(); y = y + 2){
            System.out.print(s[x].charAt(y));
        }
        System.out.println();
    }
    scanner.close();
    }
    
}
