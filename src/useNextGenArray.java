
public class useNextGenArray {
	public static void main(String[] args) {
		String[] cars = {"Tata", "Honda", "Hyundai", "BMW", "RR"};
		NextgenArray<String> nextgenArray = new NextgenArray(cars);
		
		String ele1 = nextgenArray.get(1);
		String ele2 = nextgenArray.get(3);
		
		System.out.println(ele1);
		System.out.println(ele2);
		
		nextgenArray.set(1, "120");
		
		System.out.println(nextgenArray);
		
		Integer[] nos = {10,16,22,5,3,6,8,9,7};
		NextgenArray<Integer> nextgenArray1 = new NextgenArray(nos);
		int e = nextgenArray1.get(1);
		nextgenArray1.set(2,10);
		
		
	}
}