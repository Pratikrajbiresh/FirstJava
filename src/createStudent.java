
public class createStudent {
	
	public static void main(String[] args) {
		System.out.println(Student.count);
		//Student s1 = new Student();
		//Internally
		// new ---> RAM 6006 
		// Student(6006)
		
		Student s1 = new Student( "Pratik", 'm', 57, 90f);
		
		
		Student s2 = new Student( "Pratik", 'm', 57, 90f);
		
		System.out.println(Student.count);
		
		Student s3 = new Student();
		
		
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
		System.out.println(Student.count);
		
		Student s4 = Student.newInstance("Meh", 'f', 18, 66f);
		System.out.println(s4.getDetails());
		System.out.println(Student.count);
	}
	

}
