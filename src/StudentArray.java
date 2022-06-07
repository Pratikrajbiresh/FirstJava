
public class StudentArray {
	public static void main(String[] args) {
		Student obj1 = new Student();
		Student obj2 = new Student();
		Student obj3 = new Student();
		
		Student[] ah = {obj1, obj2, obj3};
		
		for(int i = 0; i <= ah.length - 1; i++) {
			System.out.println(ah[i].Name);
			System.out.println(ah[i].Gender);
		
	}
	}
}
