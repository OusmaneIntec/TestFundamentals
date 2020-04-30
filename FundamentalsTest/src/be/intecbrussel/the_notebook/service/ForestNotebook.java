package be.intecbrussel.the_notebook.service;

import java.util.*;
import java.util.stream.Collectors;

import be.intecbrussel.the_notebook.entities.animal_entities.*;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

public class ForestNotebook {

	private List<Carnivore> carnivores;
	private List<Omnivore> omnivores;
	private List<Herbivore> herbivores;
	private int plantCount;
	private int animalCount;

	private List<Animal> animals;

	private List<Plant> plants;

	public ForestNotebook() {

		animals = new ArrayList<>();
		plants = new ArrayList<>();

	}
	/*
	* In onze list animals hebben we animals die omnivore, herbivore, carnivore kunnen zijn
	 * dus moeten we filteren om onze specifiek animals te krijgen
	 * 
	 */
	public List<Carnivore> getCarnivores() {

		return this.animals.stream().filter(Carnivore.class::isInstance).map(Carnivore.class::cast)
				.collect(Collectors.toList());
	}
	public List<Omnivore> getOmnivores() {
		return this.animals.stream().filter(Omnivore.class::isInstance)
				.map(Omnivore.class::cast)
				.collect(Collectors.toList());

	}
	public List<Herbivore> getHerbivores() {
		return this.animals.stream().filter(Herbivore.class::isInstance)
				.map(Herbivore.class::cast)
				.collect(Collectors.toList());
	}
	public void setCarnivores(List<Carnivore> carnivores) {
		this.carnivores = carnivores;
	}
	public void setOmnivores(List<Omnivore> omnivores) {
		this.omnivores = omnivores;
	}
	public void setHerbivores(List<Herbivore> hernivores) {
		this.herbivores = hernivores;
	}

	public int getPlantCount() {
		return plants.size();
	}
	public void setPlantCount(int plantCount) {
		this.plantCount = plantCount;
	}
	public int getAnimalCount() {
		return animals.size();
	}
	public void setAnimalCount(int animalCount) {
		this.animalCount = animalCount;
	}
	
	public void addAnimal(Animal animal) {
		if (this.animals.contains(animal)) {
			System.out.println("This animal is already in the forest");
		} else {
			this.animals.add(animal);
		}
	}
	public void addPlant(Plant plant) {
		this.plants.add(plant);
	}
	public void printNotebook() {
		System.out.println("\t\tThe content of our ecosystem");
		System.out.println();
		System.out.println("\t######## The animals in our ecosystem ########");
		this.animals.forEach(System.out::println);
		System.out.println();
		System.out.println("\t######## The plants in our ecosystem ########");
		this.plants.forEach(System.out::println);

	}
	public void sortAnimalsByName() {
		animals.sort(Comparator.comparing(Animal::getName));
	}
	public void sortPlantsByName() {
		plants.sort(Comparator.comparing(Plant::getName));
	}

	// Bonus vragen
	public void sortPlantsByHeight() {
		plants.sort(Comparator.comparing(Plant::getHeight));
	}
	public void sortAnimalsByHeight() {
		animals.sort(Comparator.comparing(Animal::getHeight));
	}

}
