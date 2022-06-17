package assignment6;

import java.util.Scanner;

public class Quotient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dividend :");
		int dividend=sc.nextInt();
		System.out.println("enter divisor :");
		int divisor=sc.nextInt();
		int pivot=0;
		if(dividend<0) {
			pivot++;
			dividend=-dividend;
		}
		if(divisor<0) {
			pivot++;
			divisor=-divisor;
		}
		int result=0;
		while(dividend>=divisor) {
			dividend=dividend-divisor;
			result++;
		}
		if(pivot==1) {
			System.out.println(-result);
		}else {
			System.out.println(result);
		}
		sc.close();
	}

}
