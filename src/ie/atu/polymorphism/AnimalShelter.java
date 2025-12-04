package ie.atu.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    private List<Animal> animals;
    
    public AnimalShelter() {
        this.animals = new ArrayList<>();
    }
    
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    
    public void makeAllSounds() {
        System.out.println("\nAll animals making sounds:");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
    
    public void exerciseAnimals() {
        System.out.println("\nExercising all animals:");
        for (Animal animal : animals) {
            // Common behavior
            animal.move();
            
            // Type-specific behavior
            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            } else if (animal instanceof Cat) {
                ((Cat) animal).scratch();
            } else if (animal instanceof Bird) {
                ((Bird) animal).soar();
            } else if (animal instanceof Elephant){
                ((Elephant) animal).trunk();
            }
            
            System.out.println("---------------");
        }
    }
    public void roleCall(){
        System.out.println("\n List of all the animals currently in the shelter:");
        for (Animal animal : animals) {
            System.out.println(animal.getInfo());
            if (animal instanceof Dog) {
                System.out.println("Dog");
            } else if (animal instanceof Cat) {
                System.out.println("Cat");
            } else if (animal instanceof Bird) {
                System.out.println("Bird");
            } else if (animal instanceof Elephant){
                System.out.println("Elephant");
            }
            System.out.println("---------------");
        }
    }
}
