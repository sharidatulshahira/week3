/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise53 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Type a word: ");
		String word = scan.nextLine();
		
		System.out.println("Length of the first part: " + word.substring(3));
		System.out.println("Result: " + word.substring(0,4));
		}
			
		

	

}
