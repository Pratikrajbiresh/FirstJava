import java.util.ArrayList;

public class PlayArrayList {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		
		cars.add("i10");
		cars.add("i20");
		
		System.out.println(cars); // i10 & i20
		
		cars.add(1, "Nexon");
		System.out.println(cars); // i10, Nexon , i20
		
		for(String car : cars) {
			System.out.println(car);
		}
		
		System.out.println(cars.size());
		
		System.out.println(cars.remove(0));
		System.out.println(cars);
		
		cars.remove("Nexon");
		System.out.println(cars);
		
		cars.set(0, "Tata");
		System.out.println(cars);
		
		
	}
}
