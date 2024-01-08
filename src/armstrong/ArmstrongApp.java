package armstrong;
//class methods
public class ArmstrongApp {
	//method name (non-static method)
		public static void armstrong(int n) {
			int temp,rem,sum=0,count=0;   
			//assigning n into a temp variable  
			temp=n;
				
			while(temp>0) {
				temp=temp/10;
				count++;
			}
			//loop execute until the condition becomes false
			temp=n;
			 while (temp>0)
			 {
				//determines the last digit from the number
		            rem=temp % 10;
		          //calculates the power of a number up to temp times and add the resultant to the sum variable
		            sum = sum +(int)Math.pow(rem, count);
		          //removes the last digit   
		            temp= temp/10;
			 }
			//compares the sum with n and condition to check whether the value of sum equals to user input or not.
			if(sum==n) {
				System.out.println("Yes. It is Armstrong No.");
			}
			else {
            System.out.println( "No. It is not an Armstrong No.");
        }
	}
}
