package by.tasks.algorithmization.decomposition;


//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. 
//Написать метод(методы) вычисления его площади, если угол 
//между сторонами длиной X и Y— прямой.

public class Task9 {

	public static double square(int x, int y, int z, int t) {
		int p=x+y+z+t;
		double sq=Math.sqrt((p-x)*(p-y)*(p-z)*(p-t));
		return sq;
	}
	public static void main(String[] args) {
		int x=2;
		int y=3;
		int z=4;
		int t=5;
		System.out.println("Площадь четырехугольника="+square(x,y,z,t));
	}
}
