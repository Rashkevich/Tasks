package by.tasks.simple.classes.aggregation.task5;

public enum Food {
	NO("��� �������"),
	BB("�������"),
	HB("�������, ����"),
	FB("������ �������"),
	AI("��� ��������"),
	UAI("������ ��� ��������");
		
	private String food;

	Food(String food){
			this.food=food;
	}

	@Override
	public String toString() {
		return food;
	}
}
