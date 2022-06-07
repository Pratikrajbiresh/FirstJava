
public class evenOdd {
	
	static boolean isEven(int n) {
		return n%2 == 0;
	}
	
	public static void main(String[] args) {
		int n = 9;
		/*if(isEven(n)) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}*/
		
		System.out.println(isEven(n) ? "Is is even" : "It is odd");
		
	}

}
