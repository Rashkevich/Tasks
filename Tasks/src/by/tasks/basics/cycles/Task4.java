package by.tasks.basics.cycles;

import java.math.BigInteger;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger mul = BigInteger.ONE;
		
		for( int i=1;i<=200;i++) {
			mul=mul.multiply(BigInteger.valueOf(i));
			mul=mul.multiply(BigInteger.valueOf(i));
		}
		System.out.println(mul);
	}

}
