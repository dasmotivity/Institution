package com.trainingInstitute;

public class TrainingInstitute {
	void registration(){
		System.out.println("Registered successfully");
	}
	 
	void askCourses(String course) {
		System.out.println("courses registered");
	}
	String displayCourseContent(String student ) {
		return "courses displayed here";
	}
	
	public static void main(String[] args) {
		TrainingInstitute t1=new TrainingInstitute();
		t1.registration();
		t1.askCourses("java");
		System.out.println(t1.displayCourseContent("das"));
	}

}
