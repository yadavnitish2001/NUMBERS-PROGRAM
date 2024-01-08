package evennumbers;
//class method
public class EvenNumberApp {
	//method name (non-static method)
		public static void evennumberapp(int n) {
	         // print the message
			System.out.println("The even number are:");
			// for loop begins
	        // and runs till i <= n
			for(int i=1;i<=n;i++) {
	        // check the whether condition 'if' is true or not
			if(i%2==0) {
				// Printing the value of i
				System.out.println(i);
			}
			}
		}
			
}
