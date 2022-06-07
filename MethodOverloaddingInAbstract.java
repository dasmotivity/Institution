package com.trainingInstitute;

abstract class ClassTimmings{
	abstract void classTimming(String course);
	abstract void classTimming(String course, String course2);
	
	//abstract methods can be overloaded
	
}

public class MethodOverloaddingInAbstract extends ClassTimmings{
	
	void classTimming(String course) {
		System.out.println("class timming is 9 pm");
	}
	void classTimming(String course1, String course2) {
		System.out.println("class timming is 9pm and 10am");
	}
	
    public static void main(String args[]) {
    	MethodOverloaddingInAbstract obj = new MethodOverloaddingInAbstract();
    	obj.classTimming("java");
    	obj.classTimming("java", "Python");
	}
}
