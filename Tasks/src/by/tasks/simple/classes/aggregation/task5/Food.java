package by.tasks.simple.classes.aggregation.task5;

public enum Food {
	NO("Без питания"),
	BB("Завтрак"),
	HB("Завтрак, ужин"),
	FB("Полный пансион"),
	AI("Все включено"),
	UAI("Ультра все включено");
		
	private String food;

	Food(String food){
			this.food=food;
	}

	@Override
	public String toString() {
		return food;
	}
}
