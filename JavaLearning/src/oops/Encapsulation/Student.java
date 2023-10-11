package oops.Encapsulation;

public class Student {

	private String name ="Nagaraj";
	private int rollNo =1;
	private int marks=220;
	private int age =23;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
