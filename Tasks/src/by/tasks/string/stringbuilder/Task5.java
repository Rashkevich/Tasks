package by.tasks.string.stringbuilder;


//5. ����������, ������� ��� ����� �������� �������� ������ ����������� ����� ���

public class Task5 {

	public static void main(String[] args) {
	String str="5. ����������, ������� ��� ����� �������� �������� ������ ����������� ����� ���";
	char ch[]=str.toCharArray();
	int count=0;
	for (char c:ch) {
		if (c=='�') {
			count++;
		}
	}
	System.out.println("����� � ����������� "+count+" ���");

	}

}
