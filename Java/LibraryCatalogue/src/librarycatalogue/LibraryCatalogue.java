
package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {
    
    // Propertis
    Map<String, Books> bookCollection = new HashMap<String, Books>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;
    
    public LibraryCatalogue(Map<String, Books> collection) {
        this.bookCollection = collection;
    }
    
    public LibraryCatalogue(Map<String, Books> collection,  int lengthOfCheckOutPeriod, 
            double initialLateFee, double feePerLateDay){
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckOutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }
    
    // getters
    
    public Map<String,Books> getBookCollection(){
        return this.bookCollection;
    }
    
    public int getCurrentDay(){
        return this.currentDay;
    }
    
    public int getLengthOfCheckoutPeriod(){
        return this.lengthOfCheckoutPeriod;
    }
    
    public double getInitialLateFee(){
        return this.initialLateFee;
    }
    
    public double getFeePerLateDay(){
        return this.feePerLateDay;
    }
    
    public Books getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    }
    
    // Setters
    
    public void nextDay(){
        currentDay++;
    }
    
    public void setDay(int day){
        currentDay = day;
    }
    
    // Instance Method
    
    public void checkOutBook(String title) {
        Books book = getBook(title);
        if (book.getIsCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". it is due on day "
                    + (getCurrentDay() + getLengthOfCheckoutPeriod()) + ".");
        }
    }
    
    public void returnBook(String title){
        Books book = getBook(title);
        int daylate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if (daylate > 0){
            System.out.println("You owe the library $" + (getInitialLateFee() + 
                    daylate * getFeePerLateDay()) + " because your book is " + daylate 
                    + " days overdue.");
        } else {
            System.out.println("Book Returned. Thank You.");
        }
        book.setIsCheckedOut(false, -1);
    }
    
    public void sorryBookAlreadyCheckedOut(Books book) {
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. "
                + "it should be back on day " + (book.getDayCheckedOut()
                + getLengthOfCheckoutPeriod()) + ".");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Books> bookCollection = new HashMap<String, Books>();
        Books harry = new Books("Harry Potter", 213145, 1080190);
        bookCollection.put("Harry Potter", harry);
        LibraryCatalogue library = new LibraryCatalogue(bookCollection);
        library.checkOutBook("Harry Potter");
        library.nextDay();
        library.nextDay();
        library.checkOutBook("Harry Potter");
        library.setDay(17);
        library.returnBook("Harry Potter");
        library.checkOutBook("Harry Potter");
    }
    
}
