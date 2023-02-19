import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;

public class library {
    // Add the missing implementation to this class
	ArrayList<Reading> bookList= new ArrayList<Reading>();
	ArrayList<Reading> bookBorrowed= new ArrayList<Reading>();
	String Address;
	String Title;
	Boolean borrowed;
	String Book;
	static String OpeningHours= "9am to 5pm";

	// below are the methods
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from"+" " + OpeningHours+".");
	}
	
	public void printAddress() {
		System.out.println(Address);
	}
	
	public String getTitle() {
		String Book= getTitle();
		return getTitle();
	}
	
	public void Book (String Title) {
		this.Title=Title;
	}
	public String getPropertyofString() {
		return Title;
	}
	
	public void addReading(Reading Book) {
		bookList.add(Book);
	}
	public void borrowed() {
		borrowed=true;
	}
	public Boolean thisBorrowed() {
		if (borrowed==true) {
			return true;
		}
		return false;
	}

	// below is constructor
	public library (String Address) {
		this.Address=Address;
	}
	public void borrowBook(String Title) {
		
		for(int i=0; i<bookBorrowed.size(); i++) {
			Reading name= bookBorrowed.get(i);
			
			if(name.Title.contains(Title)) {
				System.out.println("Sorry, this book is already borrowed");
				return;
			}
		}
		boolean isitinthere= bookList.stream().anyMatch(Book->Book.getPropertyofString().equals(Title));
		if(isitinthere==false) {
			System.out.println("Sorry,this book is not in our catalog.");
			return;
		}
		//check library 
		
		for(int i=0; i<bookList.size(); i++) {
			
			Reading name=bookList.get(i);
			
			if(name.Title.contains(Title)) {
				if(name.thisBorrowed()==false) {
					name.borrowed();
					bookList.remove(name);
					bookBorrowed.add(name);
					System.out.println("You sucessfully borrowed" + Title);
				}
			}
		}
	}
public void isthebookreturned (String Title) {
	boolean itsinthere=bookBorrowed.stream().anyMatch(book->book.getPropertyofString().equals(Title));
	if (itsinthere==false) {
		System.out.println("Sorry, this book is not in our catalog.");
	}
}
public void printAvailableBooks() {
		
		if(bookList.isEmpty()) {
			System.out.println("No books in catalog");
		}
		
		// cycle to print each book in library
		for(int i=0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i).getPropertyofString());  
		}
	}
	public void returnBook(String title) {
		boolean contains = bookBorrowed.stream()
				.anyMatch(book -> book.getPropertyofString().equals(title));
		
		if(contains == false) {
			System.out.println("Sorry, this book is not in our catalog.");
		}

	for(int i=0; i < bookBorrowed.size(); i++) {
		Reading name2 = bookBorrowed.get(i);
		
		if(name2.Title.contains(Title)) {
			if(name2.thisBorrowed() == true) {
				name2.returned();
				bookList.add(name2);
				bookBorrowed.remove(name2);
				System.out.println("You successfully returned "+ title);
			} else if(name2.thisBorrowed() == false) {
				System.out.println("Sorry, you are not currently borrowing this book.");
			}
		}
	}
	
	}
    public static void main(String[] args) {
        // Create two libraries
        library firstLibrary = new library("10 Main St.");
        library secondLibrary = new library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addReading(new Reading("The Da Vinci Code"));
        firstLibrary.addReading(new Reading("Le Petit Prince"));
        firstLibrary.addReading(new Reading("A Tale of Two Cities"));
        firstLibrary.addReading(new Reading("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
       System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks(); 
    }

		
	}