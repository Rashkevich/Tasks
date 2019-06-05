package by.tasks.basics.cycles;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-3;
		int b=4;
		int h=1;
		
		for (int i=a;i<=b;i=i+h) {
			if(i<=2) {
				System.out.println("x="+i+" y="+-i);
			} else if (i>2) {
				System.out.println("x="+i+" y="+i);
			}
		}
	}

}
