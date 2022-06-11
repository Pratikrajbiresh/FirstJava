import java.util.Arrays;
import java.util.HashSet;
import java.util.List;



public class PlayHastSet {
	
	public static void main(String[] args) {
		List<Integer> nos = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8);
		HashSet<Integer> hashSet = new HashSet<>(nos);
		System.out.println(hashSet);
		
		HashSet<String> fruits = new HashSet<>();
		fruits.add("Banana");
		fruits.add("Guava");
		fruits.add("Lichi");
		fruits.add("Mango");
		fruits.add("Lichi");
		
		System.out.println(fruits);
		
		fruits.remove("Mango");
		System.out.println("fruits");;
		
		System.out.println(fruits.contains("Banana"));
		System.out.println(fruits.contains("Lichi"));
	}

}
