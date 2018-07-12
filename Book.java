/**
 * @author tainglyda
 * CSC 143
 * April 19, 2018
 * 
 * Book is sub class of Publication.
 * It adds author. 
 */
public class Book extends Publication {
	private String author;

	/**
	 * @param publisher
	 * @param page
	 * @param prices
	 * @param title
	 * @param author
	 */
	public Book(String publisher, int page, double prices, String title, String author) {
		super(publisher, page, prices, title);
		this.author = author;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book: "+ super.toString()+", Author= " + author ;
	}
	
	

}
