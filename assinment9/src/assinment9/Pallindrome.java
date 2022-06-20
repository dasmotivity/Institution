package assinment9;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any integer of length 18:");
		String s=sc.next();
		Long l=Long.parseLong(s);
		System.out.println(nearPallindrome(l));
		sc.close();
	}
	private static long nearPallindrome(Long l) {
		long onePallindrome,twoPallindrome;
		int oneDistance=0,twoDistance=0;
		long a=l;
		long b=l;
		while(true) {
			if(isPallindrome(a)) {
				twoPallindrome=a;
				break;
		    }
			a++;
			oneDistance++;
		}
		while(true) {
			if(isPallindrome(b)) {
				onePallindrome=b;
				break;
		    }
			b--;
			twoDistance++;
		}
		if(oneDistance<twoDistance) {
			return twoPallindrome;
		}else {
			return onePallindrome;
		}
	}

	private static boolean isPallindrome(long a) {
		 long r,sum=0,temp;    
		  long n=a;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		  return true;   
		  else    
		  return false;
		
	}

}
