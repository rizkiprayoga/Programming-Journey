
package recursiongoodluck;


public class RecursionGoodLuck {
    
    // f(f(f(a))) --- a = 20
    // f(a) = 5 + a
    // f(20) = 25
    
    // f(f(f(20))) --- f(f(25))
    // f(25) = 30
    
    // f(f(f(20))) --- f(f(25)) --- f(30)
    // f(30) = 35
    
    // f(f(f(20))) --- f(f(25)) --- f(30) --- 35
    
    public static int Summation(int n){
        // Base Case
        if ( n <= 0 ){
            return 0;
        } else { 
            // Recursive Case
            // 3 + Summation (2)
            // 3 + 2 + Summation(1)
            // 3 + 2 + 1 + Summation (0)
            // 3 + 2 + 1 + 0
            return n + Summation( n - 1);
        }
    }
    
    public static int Factorial(int n){
        // Base Case
        if (  n <= 1){
            return 1;
        } else{
            // Recursive Case
            return n * Factorial ( n - 1);
        }
    }
    
    public static int Exponentiation( int n, int p){
        // Base Case
        if ( p <= 0){
            return 1;
        } else{
            // Recursive Case
            return n * Exponentiation ( n, p-1);
        }
    }


    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Summation(3));
        System.out.println(Factorial(5));
        System.out.println(Exponentiation(5,4));
    }
    
}
