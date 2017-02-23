/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise69 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a text: ");
	    String text = scan.nextLine();
	    
	    if (palindrome(text)) {
	       System.out.println("The text is a palindrome!");
	    } else {
	       System.out.println("The text is not a palindrome!");
	    }

	}

	public static boolean palindrome(String text) {

		//for(int i=0; i<text.length(); i++){
		//for (int j=text.length()-1; j >=0 ; j--) {
		String character = "";
		for(int j=text.length()-1; j>=0; j--){
			character =  character + text.charAt(j);
			
			if(text.equals(character)){
				return true;
			}
			
			
		}
		return false;
		
	}
}
