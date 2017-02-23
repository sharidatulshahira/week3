/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise67 {

	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The variance is: " + variance(list));

	}
	
	public static int sum(ArrayList<Integer> list){
		int i;
		int sum = 0;
		for (i=0; i<list.size(); i++){
		sum += list.get(i);
		
		
		}
		return sum;
	}
	
	public static double average(ArrayList<Integer> list) {
		double totalaverage = 0;
		return totalaverage = (double) sum(list)/4;
	}
		
	private static double variance(ArrayList<Integer> list) {
		double avg= average(list);
		double var = 0.0;
		
		for (int x: list){
			 double sumMinus = x -  avg; //num - average = sumMinus
			 sumMinus *= sumMinus; //thepowerof2
			 var +=  sumMinus; 
			 
			 
		}
		return var/(list.size()-1);
		
		//avg: (3+2+7+2)/4 = 3.5
		//var: [(3-3.5)^2 + (2-3.5)^2 + (7-3.5)^2 + (2-3.5)^2]/4
		
	}

}
