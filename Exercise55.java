/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise55 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type the first word: ");
		String word1 = scan.nextLine();
		int length = 0;
		int index = word1.indexOf(word1.substring(0, length));
		
		System.out.println("Type the second word: ");
		String word2 = scan.nextLine();
		
		System.out.println(word1.substring(index));
		
		

	}

}
