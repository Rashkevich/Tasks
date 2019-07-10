package by.tasks.simple.classes.aggregation.task5;

public enum Command { //command for sorting
FOOD("food"),
REGION("region"),
TRANSPORT("transport"),
TYPE("type"),
DAY("day")
;

	
	private String command;
	Command(String command){
		this.command=command;
	}
	@Override
	public String toString() {
		return command;
	}
	
	
}
