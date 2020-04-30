package be.intecbrussel.the_notebook.app;
import java.util.*;

import be.intecbrussel.the_notebook.entities.animal_entities.*;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

public class NatureApp {

	public static void main(String[] args) {
		
            ForestNotebook  notebook=new ForestNotebook();
            
         
            
            Tree acacia=new Tree("Acacia", 5.0);
            Tree aubour=new Tree("Aubour",4.0 );
            Flower arum =new Flower("Arum",1.0);
            Bush bush=new Bush("Bush",1.5 );
            Weed weed=new Weed("Persil", 0.4);
           // arum.setSmell(Scent.MUSKY);
            //aubour.setLeafType(LeafType.NEEDLE);
            
            Omnivore fox=new Omnivore("Fox",7.0,0.50,0.70);
            Omnivore ostrich=new Omnivore("Ostrich",5.0, 1.5,1.0);
            Herbivore cow=new Herbivore("Cow",400.0, 1.30,1.90);
            Herbivore sheep=new Herbivore("Sheep", 80.0, 0.90, 1.15);
            Carnivore lion= new Carnivore("Lion", 120.0, 1.0, 1.10);
            Carnivore wolf= new Carnivore("Wolf", 50.0, 1.0, 1.0);
            Animal unknownAnimal=new Animal("An unknown animal",1000.0, 1.0, 2.0);
            
            
            
            // Planten toevoegen
            notebook.addPlant(acacia);
            notebook.addPlant(aubour);
            notebook.addPlant(arum);
            notebook.addPlant(weed);
            notebook.addPlant(bush);
            
            
            // dieren toevoegen
            
            notebook.addAnimal(fox);
            notebook.addAnimal(ostrich);
            notebook.addAnimal(cow);
            notebook.addAnimal(lion);
            notebook.addAnimal(sheep);
            notebook.addAnimal(wolf);
            notebook.addAnimal(unknownAnimal);
            notebook.sortAnimalsByName();
            notebook.sortPlantsByName();
            notebook.printNotebook();
            
            System.out.println();
            printlistAnimals(notebook.getCarnivores());
            
            System.out.println();
            printlistAnimals(notebook.getHerbivores());
         
		
        
            
	}
     // this methode help us to print our getters collections
	private static void printlistAnimals(List<? extends Animal> animals) {
		
		animals.forEach(System.out::println);
		
	}

}
