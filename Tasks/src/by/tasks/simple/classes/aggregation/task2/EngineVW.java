package by.tasks.simple.classes.aggregation.task2;

public class EngineVW implements Engine {
	private String engine;
	
	public EngineVW(String engine) {
		this.engine = engine;
	}

	@Override
	public void printModel() {
		System.out.println("Engline:"+engine);
	}

}
