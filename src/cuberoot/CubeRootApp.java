package cuberoot;
//class methods
public class CubeRootApp {
	//method name (non-static method)
	public static void cuberoot(double n) {
	//taking result variable and declare result as double
	double result;
	//taking math.sqrt() function for find cube root and then store in variable results
	result = Math.cbrt(n);
	//print the results
       System.out.println("The Cube Root of number is:"+result);
	}
}

