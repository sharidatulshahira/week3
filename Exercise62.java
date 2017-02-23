/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise62 {

	
	public static void main(String[] args) {
		ArrayList<String> brothers = new ArrayList<String>();
		brothers.add("Dick");
		brothers.add("Henry");
		brothers.add("Michael");
		brothers.add("Bob");
		
		System.out.println("brothers: " + brothers);
		Collections.sort(brothers);
		
		
		removeLast(brothers);
		
		System.out.println(brothers);
		
		
		
		
		

	}

	private static void removeLast(ArrayList<String>list) {
		list.remove(3);
		}
		
	}


