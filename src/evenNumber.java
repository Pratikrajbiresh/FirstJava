
public class evenNumber {
	
	static String evenNumbers(int n) {
		int i = 0;
		String result = "";
		while (i <= n) {
			if (i%2 == 0) {
				result = result + i;
				
				if (i != n) {
					result = result + ',';
				}
			}
			i++;
		}
	}
		
	
	
	public static void main(String[] args) {
		int n = 20;
		System.out.println(evenNumber(n));
		
	}

}
