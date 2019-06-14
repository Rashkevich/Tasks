package by.tasks.algorithmization.decomposition;

//4. Ќа плоскости заданы своими координатами n точек. Ќаписать метод(методы), 
//определ€ющие, между какими из пар точек самое большое рассто€ние. 
//”казание.  оординаты точек занести в массив.

public class Task4 {
	public static double findDistance(double xa, double ya, double xb, double yb) {
		double distance=Math.sqrt((xb-xa)*(xb-xa)+(yb-ya)*(yb-ya));
		return distance;
	}
	
	public static double[][] findPoint(double point[][]) {
		double maxDistance=findDistance(point[0][0], point[0][1], point[1][0], point[1][1]);
		double currentDistance;
		for (int i=2;i<point.length;i++) {
			currentDistance=findDistance(point[i-1][0], point[i-1][1], point[i][0], point[i][1]);
			if (maxDistance<currentDistance) {
				maxDistance=currentDistance; //поиск максимального рассто€ни€
			}
		}
		int count=1;//счетчик максимальных рассто€ний
		for (int i=1;i<point.length;i++) {
			currentDistance=findDistance(point[i-1][0], point[i-1][1], point[i][0], point[i][1]);
			if (maxDistance==currentDistance) {
				count++;
			}
		}
		
		double pointBigDistance[][]=new double[count][2];
		System.out.println("points count="+count);
		count=0;
		for (int i=1;i<point.length;i++) {
			currentDistance=findDistance(point[i-1][0], point[i-1][1], point[i][0], point[i][1]);
			if (maxDistance==currentDistance) {
				count++;
				pointBigDistance[count-1][0]=point[i-1][0];
				pointBigDistance[count-1][1]=point[i-1][1];
				pointBigDistance[count][0]=point[i][0];
				pointBigDistance[count][1]=point[i][1];
			}
		}
		
		return pointBigDistance;
	}
	
	public static void prnt(double[][] a) {
		for (int i=1;i<a.length;i++) {
			System.out.print("xa="+a[i-1][0]+" ya="+a[i-1][1]+"xb="+a[i][0]+" yb="+a[i][1]);
			System.out.println(" Distance="+ findDistance(a[i-1][0], a[i-1][1], a[i][0], a[i][1]));
		}
		System.out.println("---------------");
	}
	

	public static void main(String[] args) {
		double point[][] ={{0,0},{2,2},{-2,-2},{2,-2},{-2,2}};
		prnt(point);
		double pointBigDistance[][]=findPoint(point);
		prnt(pointBigDistance);
		
	}

}
