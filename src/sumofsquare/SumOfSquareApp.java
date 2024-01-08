package sumofsquare;
public class SumOfSquareApp {
	//method name (non-static method)
		public static void sumofsquare(int n) {
			//Initialize sum=0;
			int sum = 0;  
			//increment the value of i after each iteration until the condition becomes false  
	        for (int i = 1; i <= n; i++)
	        	//taking the i for square and adding in variable sum
	            sum =sum+ (i * i);
			//print the results of number
			System.out.println("The sum of Sqaure of number is:"+sum);
		}
}
