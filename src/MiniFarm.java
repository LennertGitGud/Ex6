import java.util.*;

public class MiniFarm {
	private String farmName;
	private String farmerName;
	private ArrayList<Plant> plants;
	private ArrayList<Animal> animals;

	//CONSTRUCTOR
	MiniFarm(String farmName, String farmerName, ArrayList<Plant> plants, ArrayList<Animal> animals){
		this.setFarmName(farmName);
		this.setFarmerName(farmerName);
		this.setPlants(plants);
		this.setAnimals(animals);
	}

	// FARMNAME SETTER
	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}

	// FARMERNAME SETTER
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	// PLANTS SETTER
	public void setPlants(ArrayList<Plant> plants) {
		this.plants = plants;
	}

	// ANIMALS SETTER
	public void setAnimals(ArrayList<Animal> animals) {
		this.animals = animals;
	}
	
	// ANIMALS GETTER
	public ArrayList<Animal> getAnimals(){
		return this.animals;
	}

}
