/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise52 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.print("Type your name: ");
		String name = scan.nextLine();
			
		while(true){
		for(int i=name.length()-1; i>=0; i--){
			char character = name.charAt(i);
			System.out.println("In reverse order: " +character);
			
			}
			
		return;
			
		}
			
			
	}	
		
		}
		

	


