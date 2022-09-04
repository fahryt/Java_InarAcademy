package weeks03;

import java.util.Scanner;

public class Week3_Assignment04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3 peoples age: ");
		byte a = in.nextByte();
		byte b = in.nextByte();
		byte c = in.nextByte();
		
		if (a<b) {
			if (b<c) {
				System.out.println(c +" "+ b + " "+ a);
			}else if (a<c) {
				System.out.println(b +" "+ c + " "+ a);
				
			}else {
				System.out.println(b +" "+ a + " "+ c);
			}
		}
		if (b<c) {
			if (c<a) {
				System.out.println(a +" "+ c + " "+ b);
			}else if (b<a) {
				System.out.println(c +" "+ a + " "+ b);
				
			}else {
				System.out.println(c +" "+ b + " "+ a);
			}
			
		}
		if (c<a) {
			if (a<b) {
				System.out.println(b +" "+ a + " "+ c);
			}else if (c<b) {
				System.out.println(a +" "+ b + " "+ c);
				
			}else {
				System.out.println(a +" "+ c + " "+ b);
			}
		
	}

	} 
	}
