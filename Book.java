package assignment;

public class Book {
	 private String title;
	    private String author;
	    private int year;
	    private double price;

	    // Constructor
	    public Book(String title, String author, int year, double price) {
	        this.title = title;
	        this.author = author;
	        this.year = year;
	        this.price = price;
	    }

	    // Overriding toString() method
	    @Override
	    public String toString() {
	        return "Book Details:\n" +
	               "Title  : " + title + "\n" +
	               "Author : " + author + "\n" +
	               "Year   : " + year + "\n" +
	               "Price  : ₹" + price;
	    }

}
