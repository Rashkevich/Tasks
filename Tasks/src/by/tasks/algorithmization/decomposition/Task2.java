package by.tasks.algorithmization.decomposition;


//2. Ќаписать метод(методы) дл€ нахождени€ наибольшего общего делител€ четырех натуральных чисел.

public class Task2 {
	
	public static boolean isSimple(int i) { //определение простого числа
		boolean isSimple=false;
		int count=0;
			for (int j=2;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if (count==1) {
				isSimple=true;
			}
		return isSimple;
	}
	
	
	public static int[] getMultiplier(int num) { //получение списка множителей кроме 1
		int count=0;
		int numClone=num;
		for (int i=2;i<=num;i++) {
			int ost=1;
			if (isSimple(i)) {
				while (numClone%i==0) {
					count++;
					numClone=numClone/i;
				}
				
			}
		}
		//System.out.println(count);
		numClone=num;
		int multiplier[]=new int[count];
		count=0;
		for (int i=2;i<=num;i++) {
			if (isSimple(i)) {
				while (numClone%i==0) {
					multiplier[count]=i;
					count++;
					numClone=numClone/i;
				}
			}
		}
		
		return multiplier;
	}
	
	
	public static void prnt(int[] a) {
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	
	
	public static void prnt(int[][] a) {
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[] findSameNum(int[][] m) {//поиск множителей общих во всех числах
		int maxLength=m[0].length;
		int minLength=m[0].length;
		int minId=0;
		for (int i=1;i<m.length;i++) {//поиск цифры с минимальным количеством множителей
//			if (maxLength<m[i].length) {
//				maxLength=m[i].length;
//			}
			if (minLength>m[i].length) {
				minLength=m[i].length;
				minId=i;
			}
		}
		
		System.out.println("minimal length"+minLength+" Id="+minId);
		int same[]=new int[minLength];
		int countSame=0;
		for (int i=0;i<m[minId].length;i++) {//поиск множителей общих во всех числах
			for (int j=0;j<m.length;j++) {
				for (int k=0;k<m[j].length;k++) {
					if (minId!=j) {
						if (m[minId][i]==m[j][k]) {
							same[countSame]=m[minId][i];
							countSame++;
							m[minId][i]=0;
						}
					}
				}
			}
		}
		
		return same;
	}
	
	
	public static int[][] createMultiplierA(int a[]){
		int multiplierA[][]=new int[a.length][];
		for (int i=0;i<multiplierA.length;i++) {
			multiplierA[i]=getMultiplier(a[i]);
		}
		
		return multiplierA;
	}
	
	public static int nod(int same[]) {
		int nod=1;
			for (int i=0;i<same.length;i++) {
				if(same[i]!=0) {
					nod=nod*same[i];
				}
			}
		return nod;
	}
	
	
	public static void main(String[] args) {
		int a[]= {150,40,150};
		int multiplier[][]=createMultiplierA(a);
		System.out.println("ћножители чисел");
		prnt(multiplier);
		int same[]=findSameNum(multiplier);
		System.out.println("ƒл€ чисел:");
		prnt(a);
		int nod=nod(same);
		System.out.println("Ќќƒ:"+nod);
		
	}

}
