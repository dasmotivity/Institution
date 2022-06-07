package com.trainingInstitute;

//Overloading example

 class AskCourse {
	
	void askCourse(String course1) {
		System.out.println("your courses are:"+ course1);
	}
	void askCourse(String course1, String course2) {
		System.out.println("your courses are:"+ course1 + ", " + course2);
	}
	void askCourse(String course1, String course2, String course3) {
		System.out.println("your courses are:"+ course1 + ", " + course2 + "," + course3);
	}
}
class Overloading{
	public static void main(String args[]) {
		AskCourse a=new AskCourse() ;
		a.askCourse("java");
		a.askCourse("java", "python");
		a.askCourse("java", "Python", "ruby");
	
	}
}