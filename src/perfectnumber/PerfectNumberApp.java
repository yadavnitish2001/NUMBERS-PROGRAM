package perfectnumber;

public class PerfectNumberApp {
	public static void perfectnumber(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
			if(sum==n) {
				System.out.println(n+" is perfect number");
			}else {
				System.out.println(n+" is not perfect number");
			}
		}
	}

