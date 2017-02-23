/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
public class Exercise45 {

	public static int greatest (int num1, int num2, int num3){
		if (num1 < num2){
			return num2;
		}
		
		else if (num2 < num3){
			return num3;
		}
		
		else {
			return num1;
		}
	}
	
	public static void main(String[] args) {
		int answer = greatest (2,7,3);
		System.out.println("Greatest: " + answer);
		

	}

}
