
public class Perimeter {
	static int perimeterRect(int len, int bre) {
		return 2*(len+bre);
	}
	public static void main(String[] args) {
		int l1 = 23;
		int b1 = 17;
		int p1 = perimeterRect(l1,b1);
		System.out.println(p1);
	}

}
