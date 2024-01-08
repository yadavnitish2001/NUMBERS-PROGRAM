package sumofdigits;
//class method
public class SumOfDigitsApp {
	//method name (non-static method)
	public static void sumofdigit(int n) {
		//initialize sum=0;
		int sum=0;
		// for while loop begins
        // and runs till value is n >=0
		while(n>0) {
			//Taking out the last digit and adding it in sum
			sum=sum+n%10;
			//Removing the last digit
			n=n/10;
		}
		//print the value
		System.out.println("The sum of  digits is: "+sum);
	}
}
