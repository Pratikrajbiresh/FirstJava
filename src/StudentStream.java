import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.globalpayex.college.entities.studentdetails;

public class StudentStream {
	public static void main(String[] args) {
		List<studentdetails> students = Arrays.asList(
				new studentdetails("Pratik", 'm', 54, 85),
				new studentdetails("Pooja", 'f', 52, 90));
				
		
		// find names of all the students comma separated, who have scored more than 80 marks
		// stream API
		
		String str = students.stream().filter(element -> element.marks > 80)
				.map(element -> element.name)
				.collect(Collectors.joining(","));
				System.out.println(str);
		
	}

}
