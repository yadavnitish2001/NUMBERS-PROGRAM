package frequancyOfNumber;
//class method
public class FrequancyNumberApp {
	//method name (non-static method)
	public static void frequancynumber(int n,int m) {
		//Declare and initialize temp=n,rem,and count=0;
		int temp=n,rem,count=0;
		//loop execute until the condition becomes false
		while(temp>0) {
		//determines the last digit from the number
			rem=temp%10;
		//using another condition 'if' and compare rem==m or not ,if condition true then increase the count variable
			if(rem==m) {
				count++;
			}
			//Remove last digits
			temp=temp/10;
		}
		//print the results
		System.out.println("The "+m+" Present "+count+" times");
	}

}
