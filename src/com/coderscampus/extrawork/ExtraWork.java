package com.coderscampus.extrawork;

import java.util.Scanner;


public class ExtraWork {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Who is the best NBA player of all time?");
		String nbaPlayer = scanner.nextLine();
		
		if (nbaPlayer.equals("steph curry")) {
			System.out.println("You're Right");
			
		} else {
			System.out.println("What?  It's Steph Curry!!");
			
			
		}
        scanner.close();
        
        
	}

}
