import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;


import com.globalpayex.college.entities.studentdetails;

public class ContainElement {
	
	public static void main(String[] args) {
		List<studentdetails> student = Arrays.asList(
				new studentdetails("Pratik", 'm', 56, 94),
				new studentdetails("Shashank", 'm', 84, 45),
				new studentdetails("Ayush", 'm', 12, 85),
				new studentdetails("Raunak", 'm', 52, 70)
				);
		
		System.out.println("Enter roll no of student you want to search: ");
		Scanner scanner = new Scanner(System.in);
		int roll = scanner.nextInt();
		
		/*student.forEach(students -> {
			if(students.name "Pratik")
			{
				System.out.println(students.name);
				System.out.println(students.gender);
			}
		});*/
		student.containsAll(new studentdetails("NA", 'm', roll, 0));
		
	}

}
