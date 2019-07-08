package by.tasks.simple.classes.task10;

import java.time.LocalTime;

public class Fly {
private LocalTime time;
private Week day;

public Fly(LocalTime time, Week day) {
	this.time = time;
	this.day = day;
}

public Fly(String time, Week day) {
	this.time = LocalTime.parse(time);
	this.day = day;
}


public LocalTime getTime() {
	return time;
}

public void setTime(LocalTime time) {
	this.time = time;
}

public Week getDay() {
	return day;
}

public void setDay(Week day) {
	this.day = day;
}



}
