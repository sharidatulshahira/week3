/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise50 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Type your name: ");
		String name = scan.nextLine();
		
		if (name.length()>=3){
			char first = name.charAt(0);
			System.out.println(first);
			char second = name.charAt(1);
			System.out.println(second);
			char third = name.charAt(2);
			System.out.println(third);
		}
		
		else{
			System.out.println("Name length must more than 3");
		}
		
		
	}

}
