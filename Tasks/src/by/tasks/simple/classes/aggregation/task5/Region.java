package by.tasks.simple.classes.aggregation.task5;

public enum Region {
	
	MONTENEGRO("����������"),
	POLAND("������"),
	GERMANY("��������"),
	GREECE("������"),
	FINLAND("���������"),
	UKRAINE("�������");
	
	private String region;
	
	Region(String region){
		this.region=region;
	}

	@Override
	public String toString() {
		return region;
	}
	
	
}
