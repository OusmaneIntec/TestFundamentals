package be.intecbrussel.the_notebook.entities.animal_entities;

public class Carnivore extends Animal {
     private double maxFoodSize;
	public Carnivore(String name) {
		super(name);
		
	}

	public Carnivore(String name, double weight, double height, double lenght) {
		super(name, weight, height, lenght);
		
	}

	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}
	@Override
	public String toString() {
		return super.toString() ;
	}

}
