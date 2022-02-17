/*
*	name: Favour Musenga
*	SID: 19139116
*
*
*/
import java.util.Scanner;

class Question2 {
	public static void main(String[] args){
		// declare variables of type int
		int x, y, z;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		x = input.nextInt();

		System.out.print("Enter the second integer: ");
		y = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		z = input.nextInt();

		// finding product
		int product = x * y * z;

		System.out.printf("Product is %d", product);

	}
}