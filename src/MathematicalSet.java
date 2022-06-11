import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class MathematicalSet {
	
	public static void main(String[] args) {
		List<Integer> d1 = Arrays.asList(1,3,4,5,6,10);
		List<Integer> d2 = Arrays.asList(5,6,7,8,9);
		
		LinkedHashSet<Integer> sd1 = new LinkedHashSet<>(d1);
		LinkedHashSet<Integer> sd2 = new LinkedHashSet<>(d2);
		
		HashSet<Integer> csd1 = (LinkedHashSet<Integer>) sd1.clone();
		HashSet<Integer> csd2 = (LinkedHashSet<Integer>) sd2.clone();
		System.out.println(csd1);
		System.out.println(csd2);
		
		// union
		csd1.addAll(d2);
		System.out.println(csd1);
		
		// intersection
		csd1 = (LinkedHashSet<Integer>) sd1.clone();
		csd1.retainAll(sd2);
		System.out.println(csd1);
	}
	
	

}
