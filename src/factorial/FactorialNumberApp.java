package factorial;
//class method
public class FactorialNumberApp {
	//method name (non-static method)
		public static void factorialnumber(int n) {
			int fac=1;
	         // for loop begins
	        // and runs till i <= n
			for(int i=1;i<=n;i++) {
				//multiply the numbers and stored in factorial
	        fac=fac*n;
	        n--;
				// Printing the value of factorial
			}
			 System.out.println("The factorial number is:"+fac);
         }
}
