package by.tasks.algorithmization.decomposition;

//17. �� ��������� ����� ����� ����� ��� ����. �� ���������� ����� ����� ����� ��� ���� � �.�. ������� �����
//�������� ���� ����������, ����� ��������� ����? ��� ������� ������ ������������ �����������

public class Task17 {
	public static void main(String[] args) {
	int n=123;
	int num=n;
	int count=0;
	while(n>0) {
		//System.out.println(n);
		n=n-sum(n);
		count++;
	}
	System.out.println("������ �����:"+num+" ���������� �������� ����������:"+count);
	}

	public static int sum(int n) {
		int sum=0;
		while(n!=0) {
			sum=sum+n%10;
			n/=10;
		}
		return sum;
	}

}
