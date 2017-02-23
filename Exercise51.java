/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise51 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Type your name: ");
		String name = scan.nextLine();
	
	
		while (true){
			for(int i=0; i<name.length(); i++){
			System.out.println("character: " + name.charAt(i));
				
			}
			return;
		}
	}
}


