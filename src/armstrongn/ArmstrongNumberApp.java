package armstrongn;
//class methods
public class ArmstrongNumberApp {
	//method name (non-static method)
			public static void armstrongnumber(int n) {
				System.out.print("The armstrong numbers are ");
				for(int i=1;i<=n;i++) {
				int temp,rem,sum=0,count=0;   
				//assigning n into a temp variable 
				temp=i;
					// This loop executes for count the digits until the condition become false
				while(temp>0) {
					temp=temp/10;
					count++;
				}
				//loop execute until the condition becomes false
				temp=i;
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
				if(sum==i) {
					System.out.print(i+" ");
				}
				
			}
		}
	}
