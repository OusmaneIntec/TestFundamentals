package be.intecbrussel.the_notebook.entities.animal_entities;

public class Animal {
	
	private String name;
	private double weight;
	private double height;
	private double lenght;
	public Animal(String name) {
		this.name = name;
	}
	public Animal(String name, double weight, double height, double lenght) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.lenght = lenght;
	}
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	/*
	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", height=" + height + ", lenght=" + lenght + "]";
	}
	*/
	
	@Override
	public String toString() {
		return "Name = " + name + ", weight = " + weight +"kg" + ", height = " + height + "m"+ ", lenght=" + lenght +"m" ;
	}
	
	

}
