package cuberoot;

import java.util.Scanner;
//class methods
public class CubeRoot {
//main methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating the object of Scanner class
		Scanner sc=new Scanner(System.in);
		//Asking the user to enter a number
		System.out.print("Enter the  Number to find the cube root: ");
		//Reading the user inputs and storing in the variable 
		double n=sc.nextInt();
		//Creating an object to reference variable(Number)using object class,because the method is non-static
		CubeRootApp C=new CubeRootApp();
		//invoking the method
		C.cuberoot(n);
	}

}
