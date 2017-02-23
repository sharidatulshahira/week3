/**
 * 
 */
package tutorial3;

/**
 * @author SIsmail
 *
 */
public class Exercise46 {
	
	public static double average (int num1, int num2, int num3, int num4){
		double sum = num1 + num2 + num3 + num4;
		double answer = sum / 4;
		return answer;
	}

	
	public static void main(String[] args) {
		double answer = average(4,3,6,1);
		System.out.println("average: " + answer);

	}

}
