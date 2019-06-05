package by.tasks.basics.cycles;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		System.out.println("Input start natural number m:");
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		
		System.out.println("Input end natural number n:");
		int n=in.nextInt();
		 
		for (int i=m; i<=n;i++) {
			System.out.println("Current number:"+i);
			for (int j=2;j<i;j++) {
				
				if (i%j==0) {
					System.out.println("Natural number="+i+" divisor="+j);
				}
			}
			System.out.println("======================================");
		}
	}

}
