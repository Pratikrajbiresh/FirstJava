import com.abc.salary.salarycalculate;
import com.globalpayex.college.entities.Address;
import com.globalpayex.college.entities.professor;
import com.globalpayex.college.entities.studentdetails;

public class runcollege {
	
	public static void main(String[] args) {
		//int i = 10;
		
		studentdetails s = new studentdetails("Pratik", 'm', 10, 92.5f);
		s.setAddress(new Address("HH", "IN", 400069));
		System.out.println(s.getDetails());
		
		String[] subjects = {"Physics", "Chemistry"};
		professor p  = new professor("James", 'm',subjects, 5000, 24);
		//System.out.println(salarycalculate.calculate(p));
		System.out.println(p.calculate());
		
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
	
	