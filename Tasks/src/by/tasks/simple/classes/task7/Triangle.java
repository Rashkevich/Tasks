package by.tasks.simple.classes.task7;

//7. Описать класс, представляющий треугольник. 
//Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.

public class Triangle {
	private Point[] points=new Point[3];

	public Triangle(Point[] points) {
		this.points = points;
	}
	
	public Triangle(Point a, Point b, Point c) {
		points[0]=a;
		points[1]=b;
		points[2]=c;
	}

	@Override
	public String toString() {
		String s=new String();
		for (Point p:points) {
			s=s.concat(p.getX()+" "+p.getY()+"; ");
		}
		return s;
	}
	
	public Point centerPoint() {//точки пересечения медиан.
		double x=(points[0].getX()+points[1].getX()+points[2].getX())/3;
		double y=(points[0].getY()+points[1].getY()+points[2].getY())/3;
		Point point=new Point(x,y);
		return point;
	}
	
	public double square() {
		double square=0.5*((points[1].getX()-points[0].getX())*(points[2].getY()-points[0].getY())-(points[2].getX()-points[0].getX())*(points[1].getY()-points[0].getY()));
		if (square<0) {
			square=-1*square;
		}
		return square;
	}
	
	public double perimeter() {

		double l10=length(points[1],points[0]);
		double l02=length(points[0],points[2]);
		double l21=length(points[2],points[1]);
		return l10+l02+l21;
	}

	private double length(Point a, Point b) {
		double ab=Math.sqrt((b.getX()-a.getX())*(b.getX()-a.getX())+((b.getY()-a.getY())*(b.getY()-a.getY())));
		return ab;
	}
	
}
