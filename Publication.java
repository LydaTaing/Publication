/**
 * @author tainglyda
 * CSC 143
 * April 19, 2018
 * 
 * Publication is an abstract class. 
 *
 */
public abstract class Publication {
	private String publisher;
	private int page;
	private double prices;
	private String title;
	/**
	 * @param publisher
	 * @param page
	 * @param prices
	 * @param title
	 */
	public Publication(String publisher, int page, double prices, String title) {
		this.publisher = publisher;
		this.page = page;
		this.prices = prices;
		this.title = title;
	}
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the page
	 */
	public int getPage() {
		return page;
	}
	/**
	 * @param page set the page of publisher.
	 */
	public void setPage(int page) {
		this.page = page;
	}
	/**
	 * @return the prices
	 */
	public double getPrices() {
		return prices;
	}
	/**
	 * @param prices set the prices of publisher.
	 */
	public void setPrices(int prices) {
		this.prices = prices;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title set the title of publisher.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Publication: publisher= " + publisher + ", Page= " + page + ", Prices= " + prices + ", Title= " + title;
	}
	
	

}
