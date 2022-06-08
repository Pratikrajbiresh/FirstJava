import com.globalpayex.college.entities.Studentold;

public class StudentArray {
	public static void main(String[] args) {
		Studentold obj1 = new Studentold();
		Studentold obj2 = new Studentold();
		Studentold obj3 = new Studentold();
		
		Studentold[] ah = {obj1, obj2, obj3};
		
		for(int i = 0; i <= ah.length - 1; i++) {
			System.out.println(ah[i].Name);
			System.out.println(ah[i].Gender);
		
	}
	}
}
