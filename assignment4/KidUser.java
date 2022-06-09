package assignment4;

public class KidUser implements LibraryUser{
	
	int age;
	String bookType;
	
	public void registerAccount() {
		if(age<12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
	}

	public void requestBook() {
		// TODO Auto-generated method stub
		
	}
	
}
