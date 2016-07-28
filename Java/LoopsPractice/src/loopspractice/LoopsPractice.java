
package loopspractice;

public class LoopsPractice {
    
    public static void practiceWhileLoops(){
        int x = 0;
        while ( x < 5){
            System.out.println("The value of x is " + x);
            x++;
        }
    }
    
    public static void practiceDoWhileLoops(){
        int x = 0;
        do {
            System.out.println("The value of x is " + x);
            x++;
        } while ( x < 10 );
    }
    
    public static void practiceForLoops(){
        for( int x = 0; x <= 10; x++ ){
            for ( int y = 0; y <= 10; y++){
                System.out.println("(" + x + "," + y + ")");
            }
        }
    }

     public static void main(String[] args) {
        // TODO code application logic here
        practiceForLoops();
    }
    
}
