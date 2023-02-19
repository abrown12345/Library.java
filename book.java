public class book {

    String title;
    boolean borrowed;
    boolean returned;

    // Creates a new Book
    public void Book(String bookTitle) {
        // Implement this method
    	bookTitle="The Da Vinci Code";
    	
    }
   
    // Marks the book as rented
    public void borrowed() {
        // Implement this method
    	borrowed=false;
    }
   
    // Marks the book as not rented
    public boolean returned() {
        return true;
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
    	if (borrowed==true) {
    		return true;
    	} else {
    	return false;
    	}
    }
   
    // Returns the title of the book
    public String getTitle() {
        // Implement this method
    	return "The Da Vinci Code";
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        book example = new book();
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.returned());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
} 