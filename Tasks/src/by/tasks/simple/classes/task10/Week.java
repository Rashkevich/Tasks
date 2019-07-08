package by.tasks.simple.classes.task10;

public enum Week {

	   SUNDAY ("Воскресенье"),
	   MONDAY ("Понедельник"),
	   TUESDAY ("Вторник"),
	   WEDNESDAY ("Среда"),
	   THURSDAY ("Четверг"),
	   FRIDAY ("Пятница"),
	   SATURDAY ("Суббота");
	
	private String title;

	   Week(String title) {
	       this.title = title;
	   }

	   public String getTitle() {
	       return title;
	   }

	   @Override
	   public String toString() {
	       return title;
	   }
	}