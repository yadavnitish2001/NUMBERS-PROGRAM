package atmosphoricnumber;

public class AtmosphorpicApp {
	public static void atmosphorphic(int num) {
//		int y=n*n;
//		 if(y%10==n%10)
//		        System.out.println("automorphic");
//		    else
//		        System.out.println("not automorphic");
		int sqt=num*num;
	    int count=0;
	    int temp=num;
	    while(temp!=0)
	    {
	        temp=temp/10;
	        count++;
	    }
	    temp=sqt;
	    int rem=0,rev=0;
	    for(int i=0;i< count;i++)
	    {
	        rem=temp%10;
	        rev=rev*10+rem;
	        temp=temp/10;
	    }
	    if(rev==num)
	        System.out.println("Automorphic Number");
	    else
	        System.out.println("No Automorphic Number");
	}
}
