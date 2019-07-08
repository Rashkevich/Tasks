package by.tasks.simple.classes.task10;

public enum Week {

	   SUNDAY ("�����������"),
	   MONDAY ("�����������"),
	   TUESDAY ("�������"),
	   WEDNESDAY ("�����"),
	   THURSDAY ("�������"),
	   FRIDAY ("�������"),
	   SATURDAY ("�������");
	
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