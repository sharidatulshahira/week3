/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise64 {

	

	public static int sum(ArrayList<Integer> list){
		int i;
		int sum = 0;
		for (i=0; i<list.size(); i++){
		sum += list.get(i);
		
		
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list =  new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(2);
		
		System.out.println("The average is: " + average(list));
	}
	public static double average(ArrayList<Integer> list) {
		double totalaverage = 0;
		return totalaverage = (double) sum(list)/4;
	}
		

}
