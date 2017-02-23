/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise56 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Type in your text: ");
	    String text = scan.nextLine();
	    System.out.println(reverse(text));
	}

	public static String reverse(String text){
		
		
		for(int i=0; i<text.length(); i++){
		for (int j=text.length()-1; j >=0 ; j--) {
			char character = text.charAt(j);
			System.out.println(character);
			
			
		}
		break;
		
		
		}
		
		return text;		
	}

	
}
