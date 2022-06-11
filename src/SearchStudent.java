import java.util.HashMap;
import java.util.Scanner;

import com.globalpayex.college.entities.studentdetails;

public class SearchStudent {
	public static void main(String[] args) {
		HashMap<Integer, studentdetails> map = new HashMap<>(); 
		map.put(10, new studentdetails("Pratik", 'm', 56, 9));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int roll = scanner.nextInt();
		
		boolean isPresent = map.containsKey(roll);
		System.out.println(isPresent ? "Student found" : "Student Not found");
	}

}
