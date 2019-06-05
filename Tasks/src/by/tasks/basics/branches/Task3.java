package by.tasks.basics.branches;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1=-1;
		int y1=-1;
		
		int x2=-2;
		int y2=-2;
		
		int x3=-3;
		int y3=-3;
		
		if (((y3-y1)*(x2-x1))==((y2-y1)*(x3-x1))) {
			System.out.println("Points lay on the same line");
		} else {
			System.out.println("Points don`t lay on the same line");
		}
	}

}
