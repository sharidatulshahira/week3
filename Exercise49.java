/**
 * 
 */
package tutorial3;

import java.util.Scanner;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise49 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Type your name: ");
		String name=scan.nextLine();
		char last = name.charAt(name.length()-1);
		System.out.println("last character: " + last);

	}

}
