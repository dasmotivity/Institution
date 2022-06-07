package com.trainingInstitute;

public class InstanceAndStatic {
	static int count;
	int instance;
	void instanceMethod() {
		//calling static variable from instance method
		count++;
		System.out.println(count);
		
		//calling instance variable from instance method
		instance++;
		System.out.println(instance );
	}
	public static void main(String[] args) {
		// calling static variable from static method
		count++;
		System.out.println(count);
		
		//calling instance variable from static method
		
		
		//instance++;
		/**Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		Cannot make a static reference to the non-static field instance
		**/

		InstanceAndStatic ref=new InstanceAndStatic();
		ref.instance++;
		System.out.println("we can call instance variable with reference");
		
	}

}
