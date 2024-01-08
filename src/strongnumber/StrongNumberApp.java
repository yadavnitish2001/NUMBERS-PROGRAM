package strongnumber;
//class methods
public class StrongNumberApp {
	//method name (non-static method)
	public static void strongnumber(int n) {
		int sum_of_fact=0,digit;
		int temp=n;
		while(n>0) {
			int fact=1;
			digit=n%10;
			for(int i=1;i<=digit;i++) {
				fact=fact*i;
			}
			sum_of_fact=sum_of_fact+fact;
			n=n/10;
		}
		if(temp==sum_of_fact) {
			System.out.println(temp+ " is a Strong number");
		}
		else {
			System.out.println(temp+" is not a strong number");
		}
	}

}
