/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise58 {

	
	public static void main(String[] args) {
		
		ArrayList<String> word = new ArrayList<String>();
		
		
		while(true){
			
			Scanner scan = new Scanner (System.in);
			System.out.println("Type a word: ");
			String word1 = scan.nextLine();
		
		
			if (word.contains(word1)){
			System.out.println("you gave the word " + word + " twice");
			break;
			}
			
			word.add(word1);
		}
	

	}
}
