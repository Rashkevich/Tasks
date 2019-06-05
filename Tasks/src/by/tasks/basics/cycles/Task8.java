package by.tasks.basics.cycles;

public class Task8 {

	public static void main(String[] args) {
		int one=1234;
		int two=154932;
		System.out.println("Given numbers: "+one+" and "+two);
		do{
			int number=one%10;
			int twoCopy=two;
			do {
				int twoNumber=twoCopy%10;
				if (number==twoNumber) {
					System.out.println("The same numeric:"+number);
				}
				twoCopy=(twoCopy-twoNumber)/10;
			} while (twoCopy!=0);
			
			//System.out.println(number);
			one=(one-number)/10;
		} while (one!=0); 
		
	}

}
