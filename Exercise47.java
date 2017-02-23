/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
import java.util.*;

public class Exercise47 {

	// public static int calculateCharacters (String text){
	// int count = 0;
	// int temp;
	// for (int i=0; i<text.length(); i++){
	// temp = text.charAt(i);
	// count++;
	//
	// }
	// return count;

	public static void main(String[] args) {
		
		Exercise47 e = new Exercise47();
		int l = e.calculateCharacter("yhu");
		System.out.println(l);
		//calculateCharacter(null);

	}

	private int calculateCharacter(String text) {
		//System.out.println("Number of characters: " + text.length());
		return text.length();

	}

}
