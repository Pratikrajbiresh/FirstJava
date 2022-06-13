
public class getDetails {
	
	static String getDet(String Name, char Gender, int roll, float marks) {
		String result = " ";
		result = "Name : " +Name+"\n" + "Gender : " +Gender+"\n" + "roll : " +roll+"\n" +"marks : " +marks;
		return result ;		
	}
	static char comGrade(float mark){
		char grade;
		if(mark<0 || mark>100) {
			grade = 'I';
		} else if (mark >= 90) {
			grade = 'A';
		} else if (mark >= 60) {
			grade = 'B';
		} else if (mark >= 50) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		return grade;
	}
	
	
	public static void main(String[] args) {
		String Name = "Pratik";
		char Gender = 'm';
		int roll = 52;
		float marks = 66f;
		
		System.out.println(getDet(Name, Gender, roll, marks));
		System.out.println(comGrade(marks));
	}
}
