package by.tasks.string.stringbuilder;


//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”

public class Task5 {

	public static void main(String[] args) {
	String str="5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”";
	char ch[]=str.toCharArray();
	int count=0;
	for (char c:ch) {
		if (c=='а') {
			count++;
		}
	}
	System.out.println("Буква а встречается "+count+" раз");

	}

}
