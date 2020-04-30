package be.intecbrussel.the_notebook.entities.animal_entities;
import java.util.Set;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

public class Omnivore extends Animal {
     private Set<Plant>plantDiet; 
     private double maxFoodSize;
	public Omnivore(String name) {
		super(name);
		
	}

	public Omnivore(String name, double weight, double height, double lenght) {
		super(name, weight, height, lenght);
		
	}

	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}
	
	public void addPlantToDiet(Plant plant)
	{
		if (plantDiet.contains(plant)) {
			System.out.println("This plant already exist in the Omnivore diet");
		} else {

			this.plantDiet.add(plant);
		}
	}
	@Override
	public String toString() {
		return super.toString() ;
	}
	

}
