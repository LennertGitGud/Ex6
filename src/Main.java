import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Bee bee = new Bee(0);
		Cow cow = new Cow(0);
		Dog dog = new Dog(0);
		
		ArrayList<Plant> startPlants = new ArrayList<Plant>();
		
		ArrayList<Animal> startAnimals = new ArrayList<Animal>();
		startAnimals.add(bee);
		startAnimals.add(cow);
		startAnimals.add(dog);
		
		MiniFarm farm1 = new MiniFarm("FarmTastic","Lennert",startPlants,startAnimals);
		
		System.out.println(farm1.getAnimals());
	}
}
