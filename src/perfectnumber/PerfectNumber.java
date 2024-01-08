package perfectnumber;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		//Creating the object of Scanner class
		Scanner sc=new Scanner(System.in);
		//Asking the user to enter a number
		System.out.print("Enter the  Number: ");
		//Reading the user inputs and storing in the variable 
		int n=sc.nextInt();
		//Creating an object to reference variable(Number)using object class,because the method is non-static
		PerfectNumberApp p=new PerfectNumberApp();
		//invoking the method
		p.perfectnumber(n);

	}

}
