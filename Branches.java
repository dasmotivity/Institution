package com.trainingInstitute;



 abstract class InstitutionBranches {
	abstract void noOfRooms();
	abstract void noOfEmployee();
}
class MadhapurBranch extends InstitutionBranches{
	void noOfRooms() {
		System.out.println("madhapur branch has 15 rooms");
	}
	void noOfEmployee() {
		System.out.println("madhapur branch has 25 employees");
	}
}
class RaidurgBranch extends InstitutionBranches{
	void noOfRooms() {
		System.out.println("Raidurg branch has 10 rooms");
	}
	void noOfEmployee() {
		System.out.println("Raidurg branch has 25 employees");
	}
}
public class Branches{
	public static void main(String args[]) {
		MadhapurBranch madhapur=new MadhapurBranch();
		madhapur.noOfRooms();
		madhapur.noOfRooms();
		
		RaidurgBranch raidurg=new RaidurgBranch();
		raidurg.noOfRooms();
		raidurg.noOfEmployee();
		
	}
}