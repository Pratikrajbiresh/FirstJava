import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.globalpayex.college.entities.Address;
import com.globalpayex.college.entities.studentdetails;

public class StudentStream {
	public static void main(String[] args) {
		List<Object> students = Arrays.asList(
				new studentdetails("Pratik", 'm', 54, 85, new Address("IN", "USA", 1002)),
				new studentdetails("Pooja", 'f', 52, 90, new Address("PK", "USA", 5006)),
				new studentdetails("Rahil", 'm', 10, 65, new Address("LH", "VK", 9001)),
				new studentdetails("Shreya", 'f', 2, 95, null),
				new studentdetails("Rakhi", 'o', 25, 47, null));
				
				
		
		// find names of all the students comma separated, who have scored more than 80 marks
		// stream API
		
		/*String str = students.stream().filter(element -> element.marks > 80)
				.map(element -> element.name)
				.collect(Collectors.joining(","));
				System.out.println(str);*/
				
		// find the avg marks scored by all the students
		// student -> stream -> map -> terminal ?? Collectors.??
		double average = students.stream().collect(Collectors.averagingDouble(element -> element.marks));
		System.out.println(average);
		
		// statistics of the marks scored by all the students
		DoubleSummaryStatistics ds = students.stream().collect(Collectors.summarizingDouble(studentdetails -> studentdetails.marks));
		System.out.println(ds);
		System.out.println(ds.getAverage());
		System.out.println(ds.getMax());
		System.out.println(ds.getMax());
		System.out.println(ds.getMin());
		
		// group the above student list by gender
		Map<Character, List<studentdetails>> genderMap =  students.stream().collect(Collectors.groupingBy(studentdetails -> studentdetails.getGender()));
		System.out.println(genderMap);
		
		// from the above list make two groups
		// 1. scored more than 80 marks
		// 2. scored less than 80 marks
		
		Map<Boolean, List<studentdetails>> markMap = students.stream().collect(Collectors.partitioningBy(studentdetails -> studentdetails.marks >= 80));
		System.out.println(markMap);
		
		// print the names of all students comma separated as a string who belong to the USA alone
		
		/*Map<Boolean, List<Object>> countryMap = students.stream().collect(Collectors.partitioningBy(studentdetails -> studentdetails.country == "USA"));
		System.out.println(countryMap);*/
	}

}
