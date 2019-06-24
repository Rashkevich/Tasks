package by.tasks.string.stringbuilder;

//7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
//Например, если было введено "abc cde
//def", то должно быть выведено "abcdef".

public class Task7 {

	public static void main(String[] args) {
		String text="abc cde def";
		text=text.replace(" ", "");
		char ch[]=text.toCharArray();
		
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<ch.length;i++) {
			 for (int j=i+1;j<ch.length;j++) {
				 if (ch[i]==ch[j]) {
					 ch[j]='-';
				 }
			 }
		}
		
		for (int i=0;i<ch.length;i++) {
			if (ch[i]!='-') {
				sb.append(ch[i]);
			}
		}
		System.out.println(sb.toString());
	}

}
