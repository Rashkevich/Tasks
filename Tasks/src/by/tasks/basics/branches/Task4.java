package by.tasks.basics.branches;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3;
		int y=1;
		int z=5;
		
		int a=5;
		int b=2;
		
		int minXY=min(x,y);
		int minYZ=min(y,z);
		
		if ((minXY<=a)&(minYZ<=b)) {
			System.out.println("The brick goes through a hole");
		} else if ((minXY<=b)&(minYZ<=a)) {
			System.out.println("The brick goes through a hole");
		} else {
			System.out.println("The brick doesn`t go through a hole");
		}
		
	}
	
	public static int min(int x, int y) {
		int min=x;
			if(y<x) {
				min=y;
			}
		return min;
	}

}
