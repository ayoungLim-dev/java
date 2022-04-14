package ex3;

/* instanceof 연산자 활용*/

class Student extends Person{
	String grade;
	String department;
	public Student(String name){
		super(name);
		this.name = name; 
	}
}
