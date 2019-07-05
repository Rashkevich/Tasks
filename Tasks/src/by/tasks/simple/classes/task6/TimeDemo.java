package by.tasks.simple.classes.task6;
//6. Составьте описание класса для представления времени. 
//Предусмотрте возможности установки времени 
//и изменения его отдельных полей (час, минута, секунда) 
//с проверкой допустимости вводимых значений. 
//В случае недопустимых значений полей поле устанавливается в значение 0.
//Создать методы изменения времени на заданное количество часов, минут и секунд.

public class TimeDemo {
private int hour;
private int minute;
private int second;

public TimeDemo(int hour, int minute, int second) {
	
	setHour(hour);
	setMinute(minute);
	setSecond(second);
}

public int getHour() {
	return hour;
}

public void setHour(int hour) {
	if(isRightHour(hour)) {
		this.hour = hour;
	} else {
		this.hour=0;
	}
}

public int getMinute() {
	return minute;
}

public void setMinute(int minute) {
	if(isRightMinuteSecond(minute)) {
		this.minute = minute;
	} else {
		this.minute=0;
	}
}

public int getSecond() {
	return second;
}

public void setSecond(int second) {
	if(isRightMinuteSecond(second)) {
		this.second = second;
	} else {
		this.second=0;
	}
}

private boolean isRightMinuteSecond(int i) {
	return ((i<=59)&&(i>=0))?true:false;
}

private boolean isRightHour(int i) {
	return ((i<=23)&&(i>=0))?true:false;
}

@Override
public String toString() {
	String h=String.valueOf(hour);
	String m=String.valueOf(minute);
	String s=String.valueOf(second);
	if (h.length()==1) {
		h=0+h;
	}
	if (m.length()==1) {
		m=0+m;
	}
	if (s.length()==1) {
		s=0+s;
	}
	return h+":"+m+":"+s;
}



}
