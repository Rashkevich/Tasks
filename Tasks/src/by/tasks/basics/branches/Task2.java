package branches;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=4;
		int c=2;
		int d=4;
		
		
		System.out.println(max(min(a,b), min(c,d)));
	}
	
	public static int min(int x, int y) {
		int min=x;
		if (x>y) {
			min=y;
		}
		return min;
	}
	
	public static int max(int x, int y) {
		int max=x;
		if(x<y) {
			max=y;
		}
		return max;
	}

}
