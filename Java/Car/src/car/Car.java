
package car;

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false;
    // char variables use single quote, string variables uses double quote
    char condition = 'A';
    String nameOfCar = "Lucy";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;
    
    public Car(){
        
    }
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed=customMaxSpeed;
        weight=customWeight;
        isTheCarOn=customIsTheCarOn;
    }
    
    //public means this is public instances
    //void means it doesn't return anything
    public void printVariables(){
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }
    
    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }
    
    public void getIn(){
        //numberOfPeopleInCar = numberOfPeopleInCar + 1;
        if(numberOfPeopleInCar < maxNumberOfPeopleInCar){
            numberOfPeopleInCar++;
            System.out.println("Someone got in");
        } else {
            System.out.println("The car is full");
        }
    }
    
     public void getOut(){
        //numberOfPeopleInCar = numberOfPeopleInCar - 1;
        if (numberOfPeopleInCar > 0){
        numberOfPeopleInCar--;
        } else{
            System.out.println("No one inside the car");
        }    
     }
    
    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }
    
    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }
    
    public void turnTheCarOn(){
        if (!isTheCarOn /* same with isTheCarOn == false */){
            isTheCarOn = true;
        } else{
            System.out.println("The car is already on");
        }
    }
        
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
    }
    
}
