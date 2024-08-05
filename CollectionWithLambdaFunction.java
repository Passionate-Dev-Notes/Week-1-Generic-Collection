package collectionWithLambdaFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	String name;
	int marks;

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

}

public class CollectionWithLambdaFunction {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		student.add(new Student("Raj", 100));
		student.add(new Student("Akhil", 133));
		student.add(new Student("Mayank", 88));
		student.add(new Student("Sham", 103));
		student.add(new Student("Ram", 104));

		System.out.println(student);

		
		  Comparator<Student> com = new Comparator<Student>() {
		  
		  @Override public int compare(Student o1, Student o2){ if(o1.marks>o2.marks){
		  return 1; } else if(o1.marks < o2.marks) { return -1; } else return -1; } };
		 
		
			/*
			 * Comparator<Student> com = new Comparator<Student>() {
			 * 
			 * @Override public int compare(Student o1, Student o2) { return
			 * Integer.compare(o1.marks, o2.marks); } };
			 */
		 

		Collections.sort(student, com);
		System.out.println("After sorting");
		System.out.println(student);

	}

}
