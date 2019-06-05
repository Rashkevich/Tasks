package by.tasks.basics.cycles;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Input integer number:");
		int number=in.nextInt();
		int sum=0;
		for (int i=0;i<=number;i++) {
			sum=sum+i;
			
		}
		System.out.println("Summing:"+sum);
	}

}
