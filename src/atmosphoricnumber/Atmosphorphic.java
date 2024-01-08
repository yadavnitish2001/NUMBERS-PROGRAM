package atmosphoricnumber;
import java.util.Scanner;
public class Atmosphorphic {
	public static void main(String[] args) {
		//Creating the object of Scanner class
		Scanner sc=new Scanner(System.in);
		//Asking the user to enter a number
		System.out.print("Enter the  Number: ");
		//Reading the user inputs and storing in the variable 
		int num=sc.nextInt();
		//Creating an object to reference variable(Number)using object class,because the method is non-static
		AtmosphorpicApp p=new AtmosphorpicApp();
		//invoking the method
		p.atmosphorphic(num);

	}

}


