package methodloading;

public class methodoverloading {
	
	public void square() {
		System.out.println("no parameter method call:");
	}
	
	public void square(int number) {
		int square=number*number;
		System.out.println("method with integer argument called:"+square);
	}
	
	public void square(float number) {
		float square=number*number;
		System.out.println("method with float argument called:"+square);
	}
				
			
		public static void main(String[] args) {
	methodoverloading obj=new methodoverloading();
	obj.square();
	obj.square(6);
	obj.square(5.5f);

	}

}
