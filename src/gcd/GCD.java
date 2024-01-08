package gcd;
import java.util.Scanner;
//class  method
public class GCD {
//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating the object of Scanner class
		Scanner sc=new Scanner(System.in);
		//Asking the user to enter a number
		System.out.print("Enter the first  Number for GCD: ");
		//Reading the user inputs and storing in the variable 
		int n1=sc.nextInt();
		//Asking the user to enter a number
		System.out.print("Enter the first  Number for GCD: ");
		//Reading the user inputs and storing in the variable 
		int n2=sc.nextInt();
		//Creating an object to reference variable(Number)using object class,because the method is non-static
		GCDApp F=new GCDApp();
		//invoking the method
		F.gcd(n1,n2);
	}

}
