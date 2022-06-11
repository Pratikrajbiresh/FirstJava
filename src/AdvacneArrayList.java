import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AdvacneArrayList {
	
	
	
	public static void main(String[] args) {
		java.util.List<Integer> nos = Arrays.asList(4,1,5,6,7,8,92,9,3,0);
		System.out.println(nos);
		System.out.println(nos.getClass());
		
		
		// to print all the numbers from the number list without explicitly using a loop
		nos.forEach(n -> System.out.println(n));
		
		System.out.println("*****Print Even Numbers******");
		
		// to print all the even number from the number list without explicitly using a loop
		
		nos.forEach(n -> {
			if(n%2 == 0) {
				System.out.println(n);
			}
		});
		
		
		// method references
		System.out.println("*****All Numbers (Method references)******");
		
		nos.forEach(System.out::println);
		
		
		
	
	}

}
