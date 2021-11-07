package methodloading;

public class methodoverloading1 {

	
			void disp(int a,double b) {
				System.out.println("Method A");
	}
		
			void disp(int a,double b,double c) {
				System.out.println("Method B");
			}
			
			void disp(int a,float b) {
				System.out.println("Method C");
			}
			
			
		
		public static void main(String[] args) {
			
			methodoverloading1 a1= new methodoverloading1();
			a1.disp(45, 5.5);
			a1.disp(12, 5.6,2.5);
			a1.disp(58, 23f);
		
		}
		
		
}