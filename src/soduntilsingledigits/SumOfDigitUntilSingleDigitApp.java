package soduntilsingledigits;
//class method
public class SumOfDigitUntilSingleDigitApp {
	//method name (non-static method)
		public static void sumofdigit(int n) {
			//initialize and declare sum=0,rem
			int sum=0,rem;
			//initialize temp=n
			int temp=n;
			//loops runs till condition become false
			do {
				if(temp==0) {
					temp=sum;
					sum=0;
				}
				//Taking out the last digit and stored in rem.
				rem=temp%10;
				//Adding rem in sum
				sum=sum+rem;
				//Removing the last digit
				temp=temp/10;
			}while(temp>0 || sum>9);
			System.out.println(sum);
		}
}
