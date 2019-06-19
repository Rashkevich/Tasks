package by.tasks.string.stringbuilder;


//3. ѕроверить, €вл€етс€ ли заданное слово палиндромом.

public class Task3 {

	public static void main(String[] args) {
		String word="madam";
		StringBuilder sb=new StringBuilder(word);
		String str=sb.reverse().toString();
		if(word.equals(str)) {
			System.out.println("Word '"+word+ "' is a palindrom");
		} else {
			System.out.println("Word "+word+ " is not a palindrom");
		}

	}

}
