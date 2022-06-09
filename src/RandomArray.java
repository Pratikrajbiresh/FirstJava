import java.util.Random;

public class RandomArray {
	
	// Genric Methods
	
	static <T extends Number> T randomElement(T[] elements) {
		Random random = new Random();
		int index = random.nextInt(elements.length);
		return elements[index];
	}
	
	public static void main(String[] args) {
		/*String[] cars = {"Tata", "Honda", "Hyundai", "BMW", "RR"};
		String element = randomElement(cars);
		System.out.println(element);
		*/
		Integer[] nos = {10,16,22,5,3,6,8,9,7};
		int n = randomElement(nos);
		System.out.println(n);
		double[] d = {10.9,16.8,22.7,5.5,3.2,6.6,8.9,9.8,7.1};
		double dd = randomElement(nos);
		System.out.println(dd);
	}


}
