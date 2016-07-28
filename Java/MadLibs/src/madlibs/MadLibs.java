
package madlibs;

import java.util.Random;
import java.util.Scanner;


public class MadLibs {

    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNumber;
    Random rand = new Random();
    
    //Getters
    
    public String getStory(){
        return story;
    }
    
    public String getName(){
        return name;       
    }
    
    public String getAdjective1(){
        return adjective1;
    }
    
    public String getAdjective2(){
        return adjective2;
    }
    
    public String getNoun1(){
        return noun1;
    }
    
    public String getNoun2(){
        return noun2;
    }
    
    public String getNoun3(){
        return noun3;
    }
    
    public String getAdverb(){
        return adverb;
    }
    
    public String getRandomNumber(){
        return randomNumber;
    }
    
    //Setter
    
    public void setStory(String newStory){
        this.story = newStory;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setAdjective1(String newAdj1){
        this.adjective1 = newAdj1;
    }
    
    public void setAdjective2(String newAdj2){
        this.adjective2 = newAdj2;
    }
    
    public void setNoun1(String newNoun1){
        this.noun1 = newNoun1;
    }
    
    public void setNoun2(String newNoun2){
        this.noun2 = newNoun2;
    }
    
    public void setNoun3(String newNoun3){
        this.noun3 = newNoun3;
    }
    
    public void setAdverb(String newAdverb){
        this.adverb = newAdverb;
    }
   
    public void setRandomNumber(){
        int num = Math.abs(rand.nextInt()) % 101;
        int index = 0;
        int[] numberHolder = new int[3];
        while ( index < numberHolder.length){
            numberHolder[index] = num + index;
            index++;
        } 
        randomNumber = "not " + numberHolder[0] +", not " + numberHolder[1] + ", but "
                + numberHolder[2];
    }
    
    public void printInstructions(){
        System.out.println("Welcome to the MadLibs game!! if you type in words, "
                + "we'll give you stories. Start by typing a name.");
    }
    
    public void enterName(){
        setName(scanner.nextLine());
    }
    
    public void enterAdjective1(){
        System.out.println("Now i need an adjective, give me one");
        setAdjective1(scanner.nextLine());
    }
    
    public void enterAdjective2(){
        System.out.println("another adjective please");
        setAdjective2(scanner.nextLine());
    }
    
    public void enterNoun1(){
        System.out.println("I need a noun");
        setNoun1(scanner.nextLine());
    }
    
     public void enterNoun2(){
        System.out.println("gimme the next noun");
        setNoun2(scanner.nextLine());
    }
     
     public void enterNoun3(){
        System.out.println("the last noun!!");
        setNoun3(scanner.nextLine());
    }
     
    public void enterAdverb(){
        System.out.println("Last thing, an adverb!!!");
        setAdverb(scanner.nextLine());
    } 
     
    public void putTheStoryTogether(){
        int num = Math.abs(rand.nextInt()) % 2;
        String story;
        if (num == 0){
             story = "Jesse and her best friend " + getName() + " went to disneyworld today!"
                + " they saw a " + getNoun1() + " in a show at the Magic Kingdom."
                + " and ate a " + getAdjective1() + " feast for dinner. The next day I"
                + " ran " + getAdverb() + " to meet Mickey Mouse in his " + getNoun2()
                + " and then that night i gazed at the " + getRandomNumber() + " " 
                + getAdjective2() + " fireworks shooting from the " + getNoun3() + "." ;
        } else {
            story = "Amanda and her frenemy " + getName() + " went to the zoo last summer. "
                    + "They saw a huge " + getNoun1() + " and a tiny little " + getNoun2() 
                    + ". That night, they decided to climb " + getAdverb() + " into the " +
                    getNoun3() + " to get closer look. The zoo was " + getAdjective1() + 
                    " at night, but they didn't care.... until " + getRandomNumber() +
                    " " + getAdjective2() + " apes yelled in their face, making Amanda and "
                    + getName() + " all the way back home.";      
        }
            setStory(story);
    }
    
    public void play(){
        enterName();
        enterAdjective1();
        enterAdjective2();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        enterAdverb();
        setRandomNumber();
        putTheStoryTogether();
        System.out.println(getStory());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        MadLibs game = new MadLibs();
        game.printInstructions();
        game.play();
    }
    
}
