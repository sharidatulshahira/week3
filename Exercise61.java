/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise61 {

	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sharidatul");
		list.add("Shahira");
		list.add("Ismail");
		
		System.out.print("There are many items in the list: ");
		System.out.println(countItems(list));
		

	}

	private static int countItems(ArrayList<String> list) {
		
		for (int i = 0; i < list.size(); i++) {
			return list.size();
			}
		return 0;
		} 
		
		 
	

}
