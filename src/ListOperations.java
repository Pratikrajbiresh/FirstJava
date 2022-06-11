import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListOperations {
	public static void main(String[] args) {
		//source data
		List<Integer> nos = Arrays.asList(1,6,7,9,10,11,2,3,4,18,6,7);
		Stream<Integer> stream = nos.stream();
		
		//source data
		int [] n = {2,3,4,5,6,7,8,9,};
		IntStream intStream = Arrays.stream(n); // stream for integer values
		
		//build a stream from a specific numbers
		Stream<Integer> st = Stream.of(4,5,6,7,8);
		
		//empty stream
		
		Stream stream1 = Stream.empty();
		
		//create a new list consisting of add number more than 3 from the nos list
		// intermediate operation in the stream
		
		List<Integer> odds = stream.filter(element -> element % 2 != 0 && element > 3).collect(Collectors.toList());
		System.out.println(odds);
		
		
		// print the new list
		
		/*nos.forEach(n -> {
			if(n%2 != 0 && n >3) {
				System.out.println(n);
			}
		});*/
		
		// create a string of elements separated by coma, consisting of even numbers more than 2 from the nos list
		String s = nos.stream().filter(element -> element %2 == 0 && element >2)
		.map(element -> element.toString())
		
		.collect(Collectors.joining(","));
		System.out.println(s);
		
		// create a new list consisting of
		// elements more than the 4 from the nos list
		// square up each of the element
		// sort in descending order
			
		List<Integer> i = nos.stream().filter(element -> element > 4)
				.distinct()
				.map(element -> element*element)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(i);
				
						
		
	}

}
