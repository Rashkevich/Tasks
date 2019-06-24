package by.tasks.string.stringbuilder;

//8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
//длинных слов может быть несколько, не обрабатывать

public class Task8 {

	public static void main(String[] args) {
		String str="Вводится строка слов разделенных пробелами Найти самое длинное слово и вывести его на экран";
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
