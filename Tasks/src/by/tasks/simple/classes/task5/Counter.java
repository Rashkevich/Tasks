package by.tasks.simple.classes.task5;

//5. ќпишите класс, реализующий дес€тичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
//ѕредусмотрите инициализацию счетчика значени€ми по умолчанию и произвольными значени€ми. 
//—четчик имеет методы увеличени€ и уменьшени€ состо€ни€, 
//и метод позвол€ющее получить его текущее состо€ние. Ќаписать код, демонстрирующий все возможности класса.

public class Counter {
private int counter;
private int start;
public int getStart() {
	return start;
}

public void setStart(int start) {
	this.start = start;
}

public int getEnd() {
	return end;
}

public void setEnd(int end) {
	this.end = end;
}

private int end;

public Counter() {
	counter=1;
	start=1;
	end=9;
}

public Counter(int start, int end) {
	this.start=start;
	this.end=end;
	counter=start;
}

public void counterPlus() {
	counter++;
	if (counter>end) {
		counter=counter-end;
	}
}

public void counterMinus() {
	counter--;
	if (counter<start) {
		counter=end-counter;
	}
}

public int getCounter() {
	return counter;
}

public void setCounter(int counter) {
	this.counter = counter;
}

}
