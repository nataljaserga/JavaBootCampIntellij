/**
 * 
 */
package activity;

/**
 * @author 
 *
 */
public class PrintNumWithWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// Print all even numbers less than 100
		int i = 0;
		while(i<100){
			System.out.println(i);
			i=i+2;			
		}
		int e = 2;
		while(e<=100) {
			System.out.println(" " +e);
			e +=2;
		}

		// write code to Print all odd numbers less than 100
		int k =1;
		while(k<100) {
			System.out.println(" " +k);
			k +=2;
		}
	}

}
