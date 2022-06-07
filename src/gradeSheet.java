
public class gradeSheet {	
	static char comGrade(float marks){
		char grade;
		if(marks<0 || marks>100) {
			grade = 'I';
		} else if (marks >= 70) {
			grade = 'A';
		} else if (marks >= 60) {
			grade = 'B';
		} else if (marks >= 50) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		return grade;
	}

 
	
	public static void main(String[] args) {
		int marks = 56;
		System.out.println(comGrade(marks));
	}

}


