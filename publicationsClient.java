import java.util.*;

/**
 * @author tainglyda
 * CSC 143
 * April 19, 2018
 * 
 * publicationsClient using Publications class and its subclasses.
 *
 */
public class publicationsClient {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Publication Bpaper = new Book ("NY", 200, 8.99,"Paper town","John Green");	
		Publication Bpercy = new Book("Lee", 396, 12.5, "Lightening Theft", "Rick Riodan");
		Publication MagTeen = new Magazine ( "Jk. Rowell",46, 6.99, "Teen Wolf",  "quarter");
		Publication Kiddo = new KidsMagazine ("Frenkinsten", 30, 8.09, "La la land","monthly" , 9);
		Publication BNCT = new Book ("NY", 320, 9.59,"Empathy","NCT");	
		Publication BCBX = new Book("SM", 186, 12.5, "Blossom", "EX0-CBX");
		Publication Mag7 = new Magazine ( "WII",45, 6.79, "Seventeen",  "quarter");
		Publication Kidcart = new KidsMagazine ("Neo Culture", 23, 12.39, "7th Sense","Weekly" , 17);
		
		
		//System.out.println(Bpaper);
		//System.out.println(Bpercy);
		//System.out.println(MagTeen);
		//System.out.println(Kiddo);
		
		ArrayList<Publication> list = new ArrayList<>();
		list.add(Bpaper);
		list.add(MagTeen);
		list.add(Kiddo);
		list.add(Bpercy);
		list.add(BCBX);
		list.add(BNCT);
		list.add(Kidcart);
		list.add(Mag7);
		
		for (int i= 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
				
	}

}
