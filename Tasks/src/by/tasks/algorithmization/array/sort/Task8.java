package by.tasks.algorithmization.array.sort;


//8.���� �����
//( i i p , q - �����������). ��������� ���������, ������� �������� ��� ����� � ������
//����������� � ������������� �� � ������� �����������.

public class Task8 {
	
	public static void prnt(int[] arrOne, int[] arrTwo) {
		for (int i=0;i<arrOne.length;i++) {
			System.out.print(arrOne[i]+"/"+arrTwo[i]+" ");
		}
				
	}
	
	
	public static int[] sort(int arrOne[]) { //��������� ����������
		
		int temp;
		for (int i=0;i<arrOne.length;i++) {
			for (int j=1;j<arrOne.length;j++) {
				if (arrOne[j-1]>arrOne[j]) {
					temp=arrOne[j-1];
					arrOne[j-1]=arrOne[j];
					arrOne[j]=temp;
				}
			}
		}
		System.out.println();
		return arrOne;
	}
	

	public static void main(String[] args) {

		int p[]= {1,3,5,7,10};
		int q[]= {2,8,6,4,11};
		int pSecond[]=new int[p.length];
		int qSecond[]=new int[q.length];
		for (int i=0;i<q.length;i++) {
			int factor=1;
			for (int j=0;j<q.length;j++) {
				if (i!=j) {
					factor=factor*q[j];
				}
				qSecond[i]=factor*q[i];
				pSecond[i]=factor*p[i];
			}
		}
		
		prnt(p, q);
		System.out.println("-�������� �����");
		prnt(pSecond, qSecond);
		sort(pSecond);
		prnt(pSecond, qSecond);
		System.out.println("-��������������� �����");
	}

}
