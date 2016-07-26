
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
        numberOfPeopleInCar++;
    }
    
     public void getOut(){
        //numberOfPeopleInCar = numberOfPeopleInCar - 1;
        numberOfPeopleInCar--;
    }
    
    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }
    
    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Car birthdayPresent = new Car(200, 5000, true);
        System.out.println("Birthday Car V1 : ");
        birthdayPresent.printVariables();
//        System.out.println("Christmas Present:");
//        Car christmasPresent = new Car (400, 2000, false);
//        christmasPresent.printVariables();
        System.out.println("Birthday Car V2 : ");
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.printVariables();
        System.out.println("How Many Miles Left : " + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max Miles : " + birthdayPresent.maxMilesPerFillUp());
        birthdayPresent.getOut();
        System.out.println("Birthday Car V2 : ");
        birthdayPresent.printVariables();
    }
    
}
