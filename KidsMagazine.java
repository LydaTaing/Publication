/**
 * @author tainglyda
 * CSC 143
 * April 19, 2018
 * 
 * KIdsMagazine is sub class of Publication.
 * It has recommended age.
 *
 */
public class KidsMagazine extends Magazine{
	private int age;

	/**
	 * @param publisher
	 * @param page
	 * @param prices
	 * @param title
	 * @param unit
	 * @param age
	 */
	public KidsMagazine(String publisher, int page, double prices, String title, String unit, int age) {
		super(publisher, page, prices, title, unit);
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Kids Magazine: "+super.toString()+", Age=" + age ;
	}
	

}
