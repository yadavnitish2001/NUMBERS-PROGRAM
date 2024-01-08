package power;

import java.util.Scanner;
//class method
public class PowerNumber {
//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating the object of Scanner class
		Scanner sc=new Scanner(System.in);
		//Asking the user to enter a Base
		System.out.print("Enter the  base Number: ");
		//Reading the user inputs and storing in the variable 
		int base=sc.nextInt();
		//Asking the user to enter a Base
		System.out.print("Enter the  exponents Number: ");
		//Reading the user inputs and storing in the variable 
		int e=sc.nextInt();
		//Creating an object to reference variable(Number)using object class,because the method is non-static
		PowerNumberApp P=new PowerNumberApp();
		//invoking the method
		P.power(base,e);
	}

}
