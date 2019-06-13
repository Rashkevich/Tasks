package by.tasks.algorithmization.decomposition;

//1. �������� �����(������) ��� ���������� ����������� ������ �������� � ����������� ������ �������� ����
//����������� �����:

public class Task1 {
	
	public static int nok(int a, int b, int nod) {
		int nok=a*b/nod;		
		return nok;
	}
	
	public static int nod(int a, int b) {

		while ((a!=0)&&(b!=0)) {
		if (a>b) {
			a=a%b;
		} else {
			b=b%a;
		}
		}
		
		return a+b;
	}
	
	public static void main(String[] args) {
		int a=70;
		int b=126;
		System.out.println("��� ��� a="+a+" b="+b+" ����� "+nod(a,b));
		System.out.println("��� ��� a="+a+" b="+b+" ����� "+nok(a,b,nod(a,b)));
	}

}
