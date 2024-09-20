package house.construction;

import house.construction.type.ConstructionMaterialType;

public class Bunglow implements HouseType {
	private ConstructionMaterialType cmt;
	private int floorCount;
	private int plotSize;
	private int carpetArea;
	private int parkingCnt;
	
	public Bunglow(ConstructionMaterialType cmt, int flrCnt, int plotSize, 
							int carpetSize, int parkingCnt) {
		this.cmt = cmt;
		this.floorCount = flrCnt;
		this.plotSize = plotSize;
		this.carpetArea = carpetSize;
		this.parkingCnt = parkingCnt;
	}
	
	@Override
	public ConstructionMaterialType getConstructionMaterialType() {
		return cmt;
	}

	@Override
	public int getFloorCount() {
		return floorCount;
	}

	@Override
	public int getParking() {
		return parkingCnt;
	}

	@Override
	public float getPlotSize() {
		return plotSize;
	}

	@Override
	public float getCarpetArea() {
		return carpetArea;
	}
}
