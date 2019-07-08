package by.tasks.simple.classes.aggregation.task3;

import java.util.LinkedList;

public class Region {
	private LinkedList<SmallRegion>smallRegions;
	private String regionCapital;
	private int square;

	public Region(String regionCapital) {
		this.regionCapital = regionCapital;
		smallRegions=new LinkedList<SmallRegion>();
		square=0;
	}
	
	public void add(SmallRegion smReg) {
		smallRegions.add(smReg);
		square=square+smReg.getSquare();
	}

	public LinkedList<SmallRegion> getSmallRegions() {
		return smallRegions;
	}

	public void setSmallRegions(LinkedList<SmallRegion> smallRegions) {
		this.smallRegions = smallRegions;
	}

	public String getRegionCapital() {
		return regionCapital;
	}

	public void setRegionCapital(String regionCapital) {
		this.regionCapital = regionCapital;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}
	
	

}
