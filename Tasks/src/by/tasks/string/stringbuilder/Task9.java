package by.tasks.string.stringbuilder;

//9. ѕосчитать количество строчных (маленьких) и прописных (больших) букв 
//в введенной строке. ”читывать только английские
//буквы.


public class Task9 {

	public static void main(String[] args) {
		String text="Strings are immutable objects in java. You can copy them by just copying the reference attached to them. You can never change the objects to which the reference is attached.";
		char[] ch=text.toCharArray();
		int countUp=0;
		int countDown=0;
		for (int i=0;i<ch.length;i++) {
			if ((ch[i]>=65)&&(ch[i]<=90)) {
				countUp++;
			}
			
			if ((ch[i]>=97)&&(ch[i]<=122)) {
				countDown++;
			}
		}
		System.out.println("Up:"+countUp+" Down:"+countDown);
	}
}
