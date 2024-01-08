package frequancyOfNumber;

import java.util.Scanner;
//class method
public class FrequancyOfNumber {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
			//Creating the object of Scanner class
			Scanner sc=new Scanner(System.in);
			//Asking the user to enter a number
			System.out.print("Enter the  Number : ");
			//Reading the user inputs and storing in the variable 
			int n=sc.nextInt();
			//Asking the user to enter a number
			System.out.print("Enter the  digits do you find the frequancy of number : ");
			//Reading the user inputs and storing in the variable 
			int m=sc.nextInt();
			//Creating an object to reference variable(Number)using object class,because the method is non-static
			FrequancyNumberApp C=new FrequancyNumberApp();
			//invoking the method
			C.frequancynumber(n,m);
}
}
