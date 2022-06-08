import com.globalpayex.college.entities.professor;
import com.globalpayex.college.entities.student;

public class runcollege {
	
	public static void main(String[] args) {
		int i = 10;
		
		student s = new student("Pratik", 'm', 10, 92.5f);
		
		String[] subjects = {"Physics", "Chemistry"};
		professor p  = new professor("James", 'm',subjects);
		
		/*System.out.println(i);
		System.out.println(s);
		//Internally
		//System.out.println(s.toString());
		//System.out.println(student.toString());
		System.out.println(p);*/
		
		/*System.out.println(s.name);
		
		System.out.println(s.gender);
		
		System.out.println(p.name);
		System.out.println(p.gender);*/
		
		System.out.println(s.getDetails());
		System.out.println(p.getDetails());
		
		
		}
		
		
	}
	
	