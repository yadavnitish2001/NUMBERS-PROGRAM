package squareroot;

import java.util.Scanner;
//class method
public class SquareRoot {
//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating the object of Scanner class
		Scanner sc=new Scanner(System.in);
		//Asking the user to enter a Base
		System.out.print("Enter the  Number to find the square root: ");
		//Reading the user inputs and storing in the variable 
		double n=sc.nextInt();
		//Creating an object to reference variable(Number)using object class,because the method is non-static
		SquareRootApp S=new SquareRootApp();
		//invoking the method
		S.squareroot(n);
	}

}
