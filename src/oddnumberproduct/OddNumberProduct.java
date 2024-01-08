package oddnumberproduct;

import java.util.Scanner;

import evennumbers.EvenNumberApp;

//class method
public class OddNumberProduct {
//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating the object of Scanner class
				Scanner sc=new Scanner(System.in);
				//Asking the user to enter a number
				System.out.print("Enter the  Number: ");
				//Reading the user inputs and storing in the variable 
				int n=sc.nextInt();
				//Creating an object to reference variable(Number)using object class,because the method is non-static
				OddNumberProductApp O=new OddNumberProductApp();
				//invoking the method
				O.oddnumberproduct(n);
	}

}
