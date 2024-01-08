package primenumbers;
//class method
public class PrimeNumberApp {
	public static void prime(int n) {
		// for loop begins
		// and runs till i <= n and i<=j
		System.out.print("The primes numbers are: ");
		for(int i=2;i<=n;i++) {
			int count=0;
			for(int j=2;j<=i;j++) {
				if(i%j==0) 
				{
					count+=1;
				}
			}
			if (count==1) {
				//print the value
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
