
public class PlayArrays {
	
	public static void main(String[] args) {
		// create an array where we don't know the elements up front
		String[] cars = new String[4];
		
		// create an array where elements are known
		String[] fruits = {"Mango","Apple","Grapes"};
		
		// access elements of the array
		System.out.println(fruits[0]);
		System.out.println(fruits[2]);
		//System.out.println(fruits[3]); (Error)
		
		System.out.println(cars[2]);
		
		fruits[2] = "Guava";
		System.out.println(fruits[2]);
		//System.out.println(fruits);
		
		cars[0] = "BMW";
		cars[1] = "Audi";
		cars[2] = "Maruti";
		cars[3] = "Tata";
		System.out.println(cars.length);
		
		for(int i = 0; i <= cars.length - 1; i++) {
			System.out.println(cars[i]);
		}
	}

}
