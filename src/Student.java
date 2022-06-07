
public class Student {
	
	//instance attributes
	String Name;
	char Gender;
	int roll;
	float marks; 
	
	
	// class attributes
	
	static int count;
	
	//overloaded constructors
	
	Student() {
	this("NB", 'm', 25, 95f);
	}
	
	//constructor
	Student(String Name, char Gender, int roll, float marks) {
		this.Name = Name;
		this.Gender = Gender;
		this.roll = roll;
		this.marks = marks;
		++Student.count;
	}
	
	String getDetails() {
		
		return String.format("Name: %s\nGender: %s\nroll: %s\nmarks: %s", this.Name,this.Gender,this.roll,this.marks);
		//return "Name: " + this.Name + "\nGender: " + this.Gender + "\nroll: " + this.roll + "\nmarks: " + this.marks;
	}
	
	char getGrade() {
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
	
	static Student newInstance(String Name, char Gender, int roll, float marks) {
		//System.out.println(this);
		return new Student(Name, Gender, roll, marks);
	}
	}

