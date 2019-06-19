package by.tasks.string.as.chararray;

//2. Замените в строке все вхождения 'word' на 'letter'.

public class Task2 {

	public static void main(String[] args) {
		String text="2. Замените в строке все вхождения 'word' на 'letter'.2. Замените в строке все вхождения 'word' на 'letter'.2. Замените в строке все вхождения 'word' на 'letter'.";
		String str=text.replaceAll("word", "letter");
		System.out.println(str);
	}

}
