/**
 * @author tainglyda
 * CSC 143
 * April 19, 2018
 * 
 * Magazine is sub class of Publication.
 * It adds unit. 
 *
 */
public class Magazine extends Publication {
	private String unit;

	/**
	 * @param publisher
	 * @param page
	 * @param prices
	 * @param title
	 */
	public Magazine(String publisher, int page, double prices, String title,
			String unit){
		super(publisher, page, prices, title);
		this.unit = unit;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Magazine: "+ super.toString() +", Unit= " + unit ;
	}

}
