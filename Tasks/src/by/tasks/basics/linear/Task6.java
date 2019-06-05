package by.tasks.basics.linear;

public class Task6 {

	public static void main(String[] args) {
		int x=-4;
		int y=0;
		int count=0;
		if ((x>=-4)&(x<=4)){
			if ((y<=0)&(y>=-3)) {
				count=1;
			}
		} 
		
		if ((x>=-2)&(x<=2)){
			if( (y>=0)&(y<=4)) {
				count=1;
			}
		}
		
		if (count>0) {
			System.out.println("point lays in the area: true");
		} else {
			System.out.println("point lays in the area: false");
		}

	}

}
