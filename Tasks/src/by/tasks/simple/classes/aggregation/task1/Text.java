package by.tasks.simple.classes.aggregation.task1;

import java.util.LinkedList;

//1. Создать объект класса Текст, используя классы Предложение, Слово.
//Методы: дополнить текст, вывести на консоль текст, заголовок текста.

public class Text {
	private LinkedList<Sentence> sentence;
	private String title;

	public Text(String title) {
		this.title=title;
		sentence=new LinkedList<Sentence>();
	}
	
	public void add(Sentence sent) {
		sentence.add(sent);
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void printText() {
		for (Sentence sent:sentence) {
			LinkedList<Word> word=sent.getWord();
			for (int i=0;i<word.size();i++) {
					System.out.print(word.get(i).getWord()+" ");
			}
			
		}
	}
}
