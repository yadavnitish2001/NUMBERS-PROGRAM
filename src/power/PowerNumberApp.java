package power;
//class method
public class PowerNumberApp {
	//method name (non-static method)
	public static void power(int base,int e) {
		//Initialize power=1;
		int power = 1;  
		//increment the value of i after each iteration until the condition becomes false  
		for (int i = 1; i <= e; i++)   
		//calculates power  
		power = power * base;  
		//we can also used :power=(int)Math.pow(base,power)
		//print the results of number
		System.out.println("The results of number is:"+power);
		}  
	}

