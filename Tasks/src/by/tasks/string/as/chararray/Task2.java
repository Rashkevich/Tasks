package by.tasks.string.as.chararray;

//2. �������� � ������ ��� ��������� 'word' �� 'letter'.

public class Task2 {

	public static void main(String[] args) {
		String text="2. �������� � ������ ��� ��������� 'word' �� 'letter'.2. �������� � ������ ��� ��������� 'word' �� 'letter'.2. �������� � ������ ��� ��������� 'word' �� 'letter'.";
		String str=text.replaceAll("word", "letter");
		System.out.println(str);
	}

}
