package by.tasks.algorithmization.decomposition;

//3. ��������� ������� ����������� �������������� �� �������� �, ��������� ����� ���������� ������� ������������.

public class Task3 {
	
	public static double sq(int a) {
		double sq=a*a*Math.sqrt(3.0)/4*6;
		
		return sq;
	}

	public static void main(String[] args) {
		int a=6;
		double sq=sq(a);
		System.out.println("������� �������������� "+sq);
	}

}
