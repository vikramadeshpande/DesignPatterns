package house.client;

import house.construction.Bunglow;
import house.construction.HouseType;
import house.construction.type.ConstructionMaterialType;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HouseType ht = new Bunglow(ConstructionMaterialType.BRICK, 1, 2000, 3000, 2);
		System.out.println(ht.getCarpetArea());

	}

}
