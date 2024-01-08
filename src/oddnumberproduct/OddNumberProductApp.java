package oddnumberproduct;
//class method
public class OddNumberProductApp {
	//method name (non-static method)
			public static void oddnumberproduct(int n) {
		//Initialize product=1;
				int product=1;
				//print message
				System.out.println("The odd number product  are:");
				 // for loop begins
		        // and runs till the number n is ,i <= n
				for(int i=1;i<=n;i++) {
		        // check the whether condition 'if' is true or not
				if(i%2!=0) {
					//Taking out the i and product it in product variable
					product=product*i;
					//System.out.println(product);
				}
			}
				//print the product of number
				System.out.println(product);
		}
}
