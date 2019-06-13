package by.tasks.algorithmization.decomposition;


//2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

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
	
	public static int findSameNum(int[][] m) {//поиск множителей общих во всех числах и определение НОД
		int nod=1;
		int temp=1;
			for (int i=0;i<m[0].length;i++) {
				int count=0;
				temp=m[0][i];
				for (int j=0;j<m.length;j++) {
					temp=hasSame(m[j], temp);
					if (temp!=1) {
						count++;
					}
					if (count==m.length) {
						nod=nod*temp;
					}
				}
			}
		return nod;
	}
	
	
	public static int hasSame(int m[], int num) {
		int hasSame=1;
		int counter=0;
		for (int i=0;i<m.length;i++) {
			if(m[i]==num) {
				counter++;
				if (counter==1) {
					hasSame=m[i];
					m[i]=0;
				}
			}
		}
		return hasSame;
	}
	
	
	
	
	public static int[][] createMultiplierA(int a[]){
		int multiplierA[][]=new int[a.length][];
		for (int i=0;i<multiplierA.length;i++) {
			multiplierA[i]=getMultiplier(a[i]);
		}
		return multiplierA;
	}
	
	
	public static void main(String[] args) {
		int a[]= {126,70,14,42};
		int multiplier[][]=createMultiplierA(a);//матрица множителей
		System.out.println("Множители чисел");
		prnt(multiplier);
		int nod=findSameNum(multiplier);
		System.out.println("Для чисел:");
		prnt(a);
		System.out.println("НОД:"+nod);
		
	}

}
