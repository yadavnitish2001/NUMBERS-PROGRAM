package largestdigit;

import java.util.Scanner;
//class methods
public class LargestDigitNumber {
//main methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating the object of Scanner class
		Scanner sc=new Scanner(System.in);
		//Asking the user to enter a Base
		System.out.print("Enter the  Number: ");
		//Reading the user inputs and storing in the variable 
		int n=sc.nextInt();
		//Creating an object to reference variable(Number)using object class,because the method is non-static
		LargestDigitNumberApp L=new LargestDigitNumberApp();
		//invoking the method
		L.largestdigit(n);
	}

}
