package assignment5;

public class TestCompartment {

	public static void main(String[] args) {
		String [] compartment= {"FirstClass","General","Ladies","Luggage"};
		
		int random = (int)(Math.random()*(4)+1); 
		Compartment obj=getCompartment(compartment[random-1]);
		System.out.println(obj.notice());
	}

	private static Compartment getCompartment(String string) {
		if(string.equals("FirstClass"))
			return new FirstClass();
		else if(string.equals("General"))
			return new General();
		else if(string.equals("Ladies"))
			return new Ladies();
		else 
			return new Luggage();
	}

}
