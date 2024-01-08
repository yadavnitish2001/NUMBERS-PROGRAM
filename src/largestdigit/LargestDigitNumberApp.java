package largestdigit;
//class methods
public class LargestDigitNumberApp {
	//method name (non-static method)
			public static void largestdigit(int n) {
				// initialize largest =0 and smallest =0 and declare the remainder
				int rem;
				int largest=0;
				int smallest=9;
				//loop execute until the condition becomes false
				while(n>0) {
					//determines the last digit from the number
					rem=n%10;
					//we are using built type functions to find a largest digit in a number
					largest=Math.max(largest,rem);
					//we are using built type functions to find a smallest digit in a number
					smallest=Math.min(rem,smallest);
					 //removes the last digit   
					n=n/10;
				}
				//print the largest and smallest digits in a number
				System.out.println("The largest digit in a number:"+largest);
				System.out.println("The smallest digit in a number:"+smallest);
			}
		}
			
				
