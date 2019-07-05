package by.tasks.simple.classes.task7;

public class TriangleRunner {

	public static void main(String[] args) {
		Point a=new Point(1,2);
		Point b=new Point(-1,1);
		Point c=new Point(0,-1);
		Triangle triangle=new Triangle(a, b, c);
		System.out.println(triangle);
		System.out.println("Center point: x="+triangle.centerPoint().getX()+" y="+triangle.centerPoint().getY());
		System.out.println("Square:"+triangle.square());
		System.out.println("Perimetr:"+triangle.perimeter());
	}

}
