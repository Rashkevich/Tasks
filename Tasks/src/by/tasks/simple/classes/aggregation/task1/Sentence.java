package by.tasks.simple.classes.aggregation.task1;

import java.util.LinkedList;

public class Sentence {
private LinkedList<Word> word;

public Sentence() {
	word=new LinkedList<Word>();
}

public LinkedList<Word> getWord() {
	return word;
}

public void setWord(LinkedList<Word> word) {
	this.word = word;
}

public void add(Word w) {
	word.add(w);
}

}
