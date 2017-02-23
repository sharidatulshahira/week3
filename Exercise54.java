/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise54 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Type a word: ");
		String word = scan.nextLine();
		
		System.out.print("Length of end part: ");
		int length = scan.nextInt();
		
		String endpart =   word.substring(0,length);
		System.out.print("Result: " + endpart);
		
		

	}

}
