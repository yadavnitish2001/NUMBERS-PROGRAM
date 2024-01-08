package fibonacciseries;
//class method
public class FibonaciiSeriesApp {
	//method name (non-static method)
		public static void fibonacii(int n) {
			int x =0,y=1,z = 0;
			System.out.print("The fibonacci series are: ");
			/*
			do { 
				System.out.println(z+"");
				x=y;
				y=z;
				z=x+y;
			}
			while(z<n);
			*/
			for(int i=1;i<=n;i++) {
				System.out.print(x+" ");
				z=x+y;
				x=y;
				y=z;
			
			}
		}
}
		
