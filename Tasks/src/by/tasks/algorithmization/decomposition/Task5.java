package by.tasks.algorithmization.decomposition;

//5. ��������� ���������, ������� � ������� A[N] ������� 
//������ �� �������� ����� (������� �� ������ �����, 
//		������� ������ ������������� �������� �������, 
//		�� ������ ���� ������ ���������).


public class Task5 {
	
	public static int findMax(int a[]) {
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}
	
	public static int findSecondMax(int a[], int max) {
		int secondMax=a[0];
		for(int i=0;i<a.length;i++) {
			if ((secondMax<max)&&(secondMax<a[i])) {
				if (a[i]!=max) {
					secondMax=a[i];
				}
			}
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		int a[]= {2,5,4,6,3,1,2,8};
		int max=findMax(a);
		System.out.println("������������ ����� :"+max);
		int secondMax=findSecondMax(a, max);
		System.out.println("������ ������������ �����:"+secondMax);

	}

}
