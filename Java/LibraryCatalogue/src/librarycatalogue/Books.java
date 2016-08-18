
package librarycatalogue;

public class Books {
    
    // Attributes, Fields, Global Variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; // whether the book is checked out or not
    int dayCheckedOut = -1;
    
    // Constructor
    public Books(String bookTitle, int bookPageCount, int bookISBN){
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        this.isCheckedOut = false;
    }
    
    // Getters
    public String getTitle(){
        return this.title;
    }
    
    public int getPageCount(){
        return this.pageCount;
    }
    
    public int getISBN(){
        return this.ISBN;
    }
    
    public boolean getIsCheckedOut(){
        return this.isCheckedOut;
    }
    
    public int getDayCheckedOut(){
        return this.dayCheckedOut;
    }
    
    // Setters
    
    public void setIsCheckedOut(boolean newIsCheckedOut, int newDayCheckedOut){
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(newDayCheckedOut);
    }
    
    // private means it can only be access through books class
    private void setDayCheckedOut(int day){
        this.dayCheckedOut = day;
    }
}
