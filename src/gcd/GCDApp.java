package gcd;
public class GCDApp {
	//method name (non-static method)
		public static void gcd(int n1,int n2) {
			// initially set to gcd
		    int gcd = 1;
		    for (int i = 1; i <= n1 && i <= n2; ++i) {
		      // check if i perfectly divides both n1 and n2
		      if (n1 % i == 0 && n2 % i == 0)
		    	  //initialize gcd=i
		        gcd = i;
		      /*
		       while(n1!=n2){
		       if(n1>n2)
		       {
		       n1=n1-n2;
		       }
		       else
		       {
		       n2=n2-1;
		       }
		       System.out.println(n2);
		       */
		    }
            //print the gcd of two number
		    System.out.println("GCD of " + n1 +" and " + n2 + " is :" + gcd);
		  }
		}

