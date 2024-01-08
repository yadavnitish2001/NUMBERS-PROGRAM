package perfectsquare;

import java.util.Scanner;
public class PerfectSquare {
		public static void main(String[] args) {
			//Creating the object of Scanner class
			Scanner sc=new Scanner(System.in);
			//Asking the user to enter a number
			System.out.print("Enter the  Number: ");
			//Reading the user inputs and storing in the variable 
			int n=sc.nextInt();
			//Creating an object to reference variable(Number)using object class,because the method is non-static
			PerfectSquareApp p=new PerfectSquareApp();
			//invoking the method
			p.perfectsquare(n);

	}

}
