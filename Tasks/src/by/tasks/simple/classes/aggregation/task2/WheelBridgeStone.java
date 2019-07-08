package by.tasks.simple.classes.aggregation.task2;

public class WheelBridgeStone implements Wheel{
	private String wheel;
	
	
	public WheelBridgeStone(String wheel) {
		this.wheel = wheel;
	}


	@Override
	public void changeWheel() {
		System.out.println("Change wheel:"+wheel);
		
	}

}
