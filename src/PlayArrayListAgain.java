import java.lang.invoke.LambdaConversionException;
import java.util.ArrayList;
import java.util.Comparator;

public class PlayArrayListAgain {
	
	public static void main(String[] args) {
		ArrayList<Integer> nos = new ArrayList<>();
		
		nos.add(1);
		nos.add(56);
		nos.add(23);
		nos.add(88);
		nos.add(23);
		nos.add(2);
		nos.add(96);
		nos.add(100);
		
		// Inner class - define a class inside a class!!
		/* class DiscendingComparator2 implements Comparator<Integer> {



			 @Override
			 public int compare(Integer o1, Integer o2) {
			 	// TODO Auto-generated method stub
			 	
			 	return o2.compareTo(o1);
			 	}

			 }*/
		
		// print in descending order
		
		/*nos.sort(new DiscendingComparator2());
		
		// annonymous inner class
		
		nos.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});*/
		
		// lambda expressions 
		
		nos.sort((o1,o2) -> o2.compareTo(o1));
		
		System.out.println(nos);
		
		
	}

}
