package by.tasks.string.stringbuilder;

//8. �������� ������ ����, ����������� ���������. ����� ����� ������� ����� � ������� ��� �� �����. ������, ����� �����
//������� ���� ����� ���� ���������, �� ������������

public class Task8 {

	public static void main(String[] args) {
		String str="�������� ������ ���� ����������� ��������� ����� ����� ������� ����� � ������� ��� �� �����";
		String arr[]=str.split("\\s+");
		int max=0;
		String word=new String();
		for (String s:arr) {
			if (max<s.length()) {
				max=s.length();
				word=s;
			}
		}
		System.out.print(word);
	}

}
