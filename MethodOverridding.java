package com.trainingInstitute;

class Person{
	void teach() {
		System.out.println("teach");
	}
}
class JavaTuitor extends Person{
	void teach() {
		System.out.println("teaches java");
	}
}
class PythonTuitor extends Person{
	void teach() {
		System.out.println("teaches python");
	}
}
class SqlTuitor extends Person{
	void teach() {
		System.out.println("teaches sql");
	}
}

public class MethodOverridding {

	public static void main(String[] args) {
		Person person = new Person();
		person.teach();
		person =new JavaTuitor();
		person.teach();
		person =new PythonTuitor();
		person.teach();
		person =new SqlTuitor();
		person.teach();
	}

}
