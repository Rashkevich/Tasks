package by.tasks.simple.classes.aggregation.task3;

import java.util.LinkedList;

public class State {
private String capital;
private LinkedList<Region> regions;
private int square;

public State(String capital) {
	this.capital = capital;
	regions=new LinkedList<Region>();
	square=0;
}

public void add(Region region) {
	regions.add(region);
	square=square+region.getSquare();
}

public String getCapital() {
	return capital;
}

public void setCapital(String capital) {
	this.capital = capital;
}

public LinkedList<Region> getRegions() {
	return regions;
}

public void setRegions(LinkedList<Region> regions) {
	this.regions = regions;
}

public int getSquare() {
	return square;
}

public void setSquare(int square) {
	this.square = square;
}

public void printState() {
	System.out.println(" Capital:"+ capital+" region count:"+regions.size()+" square:"+square);
	for (Region region:regions) {
		LinkedList<SmallRegion> sr=region.getSmallRegions();
		System.out.println("Region center:"+region.getRegionCapital());
	}
}

}
