package assignment7;

import java.util.LinkedList;
import java.util.Scanner;

public class RotateLInkedList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> list=new LinkedList<String>();
		System.out.println("enter numbers you want to insert:");
		boolean check=true;
		while(check) {
			System.out.println("enter null for exit");
			String s=sc.next();
			if(s.equals("null"))
				check=false;
			else
				list.add(s);
		}
		
		System.out.println("your list is:");
		
		System.out.println(list);
		System.out.println("enter number of rotations:k=");
		int k=sc.nextInt();
		rotation(list,k);
		sc.close();
	}

	private static void rotation(LinkedList<String> list, int k) {
		while(k!=0) {
			list.addFirst(list.removeLast());
			k--;
		}
		System.out.println(list);
		}
		
	}


