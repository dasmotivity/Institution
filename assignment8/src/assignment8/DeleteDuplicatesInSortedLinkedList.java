package assignment8;

import java.util.LinkedList;
import java.util.Scanner;

public class DeleteDuplicatesInSortedLinkedList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> list=new LinkedList<Integer>();
		System.out.println("enter any alphabet for exit:\n enter sorted numbers you want to insert:");
		boolean check=true;
		while(check) {
			try {
			Integer s=sc.nextInt();
			list.add(s);
			}catch(Exception e) {
				check=false;
			}
		}
		System.out.println("your list is:");
		System.out.println(list);
		deleteDuplicate(list);
		sc.close();
	}
	private static void deleteDuplicate(LinkedList<Integer> list) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		for(int i:list) {
			if(l.contains(i)) {
				
			}else {
				l.add(i);
			}
		}
		
		
		
		System.out.println(l);
	}
	

}
