package by.tasks.simple.classes.aggregation.task1;

//Что такое Stream api? Stream API — это новый способ работать со структурами данных в функциональном стиле.
public class TextRunner {

	public static void main(String[] args) {
		Word w1=new Word("Что");
		Word w2=new Word("такое");
		Word w3=new Word("Stream");
		Word w4=new Word("api?");
		Word w5=new Word("Stream");
		Word w6=new Word("API");
		Word w7=new Word("-это");
		Word w8=new Word("хорошо.");
		Sentence sentence=new Sentence();
		sentence.add(w1);
		sentence.add(w2);
		sentence.add(w3);
		sentence.add(w4);
		Sentence sentence2=new Sentence();
		sentence2.add(w5);
		sentence2.add(w6);
		sentence2.add(w7);
		sentence2.add(w8);
		Text text=new Text("Stream api");
		text.add(sentence);
		text.add(sentence2);
		System.out.println("Title:"+text.getTitle());
		text.printText();
	}

}
