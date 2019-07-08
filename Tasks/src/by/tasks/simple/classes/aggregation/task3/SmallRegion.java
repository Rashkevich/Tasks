package by.tasks.simple.classes.aggregation.task3;

import java.util.LinkedList;

public class SmallRegion {
	private LinkedList<String>towns;
	private int square;
	
	public SmallRegion() {
		towns=new LinkedList<String>();
	}

	public LinkedList<String> getTowns() {
		return towns;
	}

	public void setTowns(LinkedList<String> towns) {
		this.towns = towns;
	}
	
	public void add(String town) {
		towns.add(town);
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}
	
}
