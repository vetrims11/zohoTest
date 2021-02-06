//package test;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		int number=sc.nextInt();
		sc.close();
		
		for(int i=0; i<number; i++) {
			
			for(int j=0,m=number; j<i; j++,m--) {
				System.out.print(m+"  ");
			}
			
			for(int k=i,n=number-i; k<number; k++) {
				System.out.print(n+"  ");
			}
			
			System.out.println();
		}

		
	}

}
