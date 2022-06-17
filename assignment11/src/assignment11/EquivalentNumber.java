package assignment11;

import java.util.Scanner;

public class EquivalentNumber {

	public static void main(String[] args) {
		System.out.println("Given Number : "+Integer.parseInt(args[0]));
		System.out.println("Binary equivalent :  "+Integer.toBinaryString(Integer.parseInt(args[0])));
		System.out.println("Octal equivalent : "+Integer.toHexString(Integer.parseInt(args[0])));
		System.out.println("Hexadecimal equivalent : "+Integer.toOctalString(Integer.parseInt(args[0])));
	}
}
