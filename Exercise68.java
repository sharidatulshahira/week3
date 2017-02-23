/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise68 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);
	    
	    System.out.print("Type a number: ");
	    int number = scan.nextInt();
	    
	    if (moreThanOnce(list, number)) {
	        System.out.println(number + " appears more than once.");
	    } else {
	        System.out.println(number + " does not appear more than once.");
	    } 

	}

	public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
		int count = 0;
		for (int x : list){
			if (x==number)
			count++;
		}
		return count > 1;
		
		
	}

}
