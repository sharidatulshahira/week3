/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise65 {

	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hallo");
		list.add("Moi");
		list.add("Benvenuto");
		list.add("badger badger badger badger");
		ArrayList<Integer> lengths = lengths(list);
		
		System.out.println("The lengths of the Strings: " + lengths);
		

	}

	private static ArrayList<Integer> lengths(ArrayList<String> list) {
		ArrayList<Integer> newlength = new ArrayList<Integer>();
		for (String x : list) {
			newlength.add(x.length());
			//return newlength;
			
			
		}
		
		return newlength;
	}

}
