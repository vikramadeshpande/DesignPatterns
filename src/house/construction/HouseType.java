package house.construction;

import house.construction.type.ConstructionMaterialType;

public interface HouseType {

	public ConstructionMaterialType  getConstructionMaterialType();
	public int getFloorCount();
	public int getParking();
	public float getPlotSize();
	public float getCarpetArea();
	
}
