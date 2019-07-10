package by.tasks.simple.classes.aggregation.task5;

public enum Transport {
	
	BUS("BUS"),
	AIRPLAIN("AIRPLAIN"),
	TRAIN("TRAIN");
		
	private String transport;

	Transport(String transport){
			this.transport=transport;
	}

	@Override
	public String toString() {
		return transport;
	}

}
