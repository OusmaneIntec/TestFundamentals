package be.intecbrussel.the_notebook.entities.animal_entities;
import java.util.Set;

import be.intecbrussel.the_notebook.entities.plant_entities.*;

public class Herbivore extends Animal {
     private Set<Plant> plantDiet;
	public Herbivore(String name) {
		super(name);
		
	}

	public Herbivore(String name, double weight, double height, double lenght) {
		super(name, weight, height, lenght);
		
	}

	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}
	
	public void addPlantToDiet(Plant plant) {

		if (plantDiet.contains(plant)) {
			System.out.println("This plant already exist in the herbivore diet");
		} else {

			this.plantDiet.add(plant);
		}

	}
	public void printDiet()
	{
	System.out.println("Diet of "+ super.getName());
	this.plantDiet.forEach(System.out::println);
		
	}

	
	@Override
	public String toString() {
		return super.toString() ;
	}
	
   
}
