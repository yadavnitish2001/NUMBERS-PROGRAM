package perfectsquare;

public class PerfectSquareApp {
	public static void perfectsquare(int n) {
//		  int sqrt = (int) Math.sqrt(n);
//          if (sqrt * sqrt == n) {
//              System.out.println("The number is perfect square");
//          }else {
//        	  System.out.println("The number is not perfect square");
//          
		for (int i = 1; i <= n; i++) {
            int sqrt = (int) Math.sqrt(n);
            if (sqrt * sqrt == n) {
                System.out.println(n);
            }
        }
	}
}
