package by.tasks.string.stringbuilder;

//6. �� �������� ������ �������� �����, �������� ������ ������ ������

public class Task6 {
	public static void main(String[] args) {
		String str="6. �� �������� ������ �������� �����, �������� ������ ������ ������";
		char ch[]=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for (char c:ch) {
			sb.append(c);
			sb.append(c);
		}
		
		String newStr=sb.toString();
		System.out.println(newStr);
	}
}
