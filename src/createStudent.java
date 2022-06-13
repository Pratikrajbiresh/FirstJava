import com.globalpayex.college.entities.Studentold;

public class createStudent {
	
	public static void main(String[] args) {
		System.out.println(Studentold.count);
		//Student s1 = new Student();
		//Internally
		// new ---> RAM 6006 
		// Student(6006)
		
		final Studentold s1 = new Studentold( "Pratik", 'm', 57, 90f);
		// s1 is final and cannot reassign a new value
		
		final Studentold s2 = new Studentold( "Pratik", 'm', 57, 90f);
		// s2 is final and cannot reassign a new value
		
		System.out.println(Studentold.count);
		
		Studentold s3 = new Studentold();
		
		
		/*System.out.println(s1.Name);
		System.out.println(s1.Gender);
		System.out.println(s1.roll);
		System.out.println(s1.marks);*/
		
		/*s1.Name = "Pratik";
		s1.Gender = 'm';
		s1.roll = 56;
		s1.marks = 90;*/
		
		/*s2.Name = "Rahul";
		s2.Gender = 'm';
		s2.roll = 57;
		s2.marks = 25;*/
		/*System.out.println(s1.Name);
		System.out.println(s2.Name);*/
		
		
		System.out.println(s1.getDetails());
		System.out.println(s1.getGrade());
		
		System.out.println(s2.getDetails());
		System.out.println(s2.getGrade());
		
		System.out.println(s3.getDetails());
		System.out.println(s3.getGrade());
		System.out.println(Studentold.count);
		
		Studentold s4 = Studentold.newInstance("Meh", 'f', 18, 66f);
		System.out.println(s4.getDetails());
		System.out.println(Studentold.count);
	}
	

}
