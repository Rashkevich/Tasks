package by.tasks.string.stringbuilder;

//2. В строке вставить после каждого символа 'a' символ 'b'.

public class Task2 {

	public static void main(String[] args) {
		String text="2. В строке a вставить после a каждого символа 'a' символ 'b'.";
		StringBuilder sb=new StringBuilder(text);
		int count=1;
		for (int i=0;i<text.length();i++) {
			char ch=text.charAt(i);
			if (ch=='a') {
				sb.insert(i+count, 'b');
				count++;
			}
		}
		System.out.println(sb.toString());
	}

}
