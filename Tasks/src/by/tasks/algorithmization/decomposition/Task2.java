package by.tasks.algorithmization.decomposition;


//2. �������� �����(������) ��� ���������� ����������� ������ �������� ������� ����������� �����.

public class Task2 {
	
	public static boolean isSimple(int i) { //����������� �������� �����
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
	
	
	public static int[] getMultiplier(int num) { //��������� ������ ���������� ����� 1
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
	
	public static int[] findSameNum(int[][] m) {//����� ���������� ����� �� ���� ������
		int maxLength=m[0].length;
		int minLength=m[0].length;
		int minId=0;
		for (int i=1;i<m.length;i++) {//����� ����� � ����������� ����������� ����������
//			if (maxLength<m[i].length) {
//				maxLength=m[i].length;
//			}
			if (minLength>m[i].length) {
				minLength=m[i].length;
				minId=i;
			}
		}
		
		System.out.println("minimal length"+minLength+" Id="+minId);
		int same[]=m[minId];
		int countSame=0;
		for (int i=0;i<same.length;i++) {
			for (int j=0;j<m.length;j++) {
				for (int k=0;k<m[j].length;k++) {
					if (j!=minId) {
						if(same[i]==m[j][k]) {
							countSame++;
							m[j][k]=0;
						}
					}
				}
			}
		}
//		for (int i=0;i<m[minId].length;i++) {//����� ���������� ����� �� ���� ������
//			for (int j=0;j<m.length;j++) {
//				for (int k=0;k<m[j].length;k++) {
//					if (minId!=j) {
//						if (m[minId][i]==m[j][k]) {
//							same[countSame]=m[minId][i];
//							countSame++;
//							m[minId][i]=0;
//						}
//					}
//				}
//			}
//		}
		
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
		int a[]= {15,4,10};
		int multiplier[][]=createMultiplierA(a);
		System.out.println("��������� �����");
		prnt(multiplier);
		int same[]=findSameNum(multiplier);
		System.out.println("��� �����:");
		prnt(a);
		int nod=nod(same);
		System.out.println("���:"+nod);
		
	}

}
