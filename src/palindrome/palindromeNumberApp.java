package palindrome;
//class method
public class palindromeNumberApp {
	//method name (non-static method)
	public static void palimdrome(int n) {
		//initialize reverse=0
		int rev=0;
		// for while loop begins
        // and runs till n >=0
		while(n>0) {
			rev=(rev*10)+n%10;
			n=n/10;
		}
		//print the value
		System.out.println("The palindrome number is:"+rev);
	}
}
