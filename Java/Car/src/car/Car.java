
package car;

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    // char variables use single quote, string variables uses double quote
    char condition = 'A';
    String nameOfCar = "Lucy";
    
    //public means this is public class
    //void means it doesn't return anything
    public void printVariables(){
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
    }
    
    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Car familyCar = new Car();
        System.out.println("Family's Car :");
        familyCar.printVariables();
        familyCar.upgradeMinSpeed();
        familyCar.printVariables();
    }
    
}
