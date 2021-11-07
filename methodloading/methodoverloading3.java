package methodloading;

/* question 2 return type is different,method name
 * and argument list same.
*/
public class methodoverloading3 {

	public double mymethod(int num1,int num2) {
		System.out.println("first mymethod of class demo");
		return num1+num2;
	}
	
	public int mymethod(byte var1,int var2) {
		System.out.println("second mymethod of class demo");
		return var1-var2;
	}
	public static void main(String[] args) {
		methodoverloading3 obj=new methodoverloading3();
	obj.mymethod(10,10);
	obj.mymethod(20, 12);
	}

}
