package by.tasks.simple.classes.aggregation.task5;

public enum Region {
	
	MONTENEGRO("Черногория"),
	POLAND("Польша"),
	GERMANY("Германия"),
	GREECE("Греция"),
	FINLAND("Финляндия"),
	UKRAINE("Украина");
	
	private String region;
	
	Region(String region){
		this.region=region;
	}

	@Override
	public String toString() {
		return region;
	}
	
	
}
