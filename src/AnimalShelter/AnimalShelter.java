package AnimalShelter;

import animal.Animal;
import animal.Cat;
import animal.Treatable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Klasse AnimalShelter
public class AnimalShelter {
    private List<Animal> animals;

    public AnimalShelter() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void sortAnimals() {
        Collections.sort(animals, Comparator.comparingInt(Animal::getAnimalId));
    }

    public void sortAnimalsByName() {
        Collections.sort(animals, Comparator.comparing(Animal::getName));
    }

    public void sortAnimalsByAge() {
        Collections.sort(animals, Comparator.comparingInt(Animal::getAge));
    }

    public void printAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void printAnimalsNotVaccinated(Disease disease) {
        for (Animal animal : animals) {
            if (!animal.getIsVaccinated().containsKey(disease) || !animal.getIsVaccinated().get(disease)) {
                System.out.println(animal);
            }
        }
    }

    public Animal findAnimal(int animalNumber) {
        for (Animal animal : animals) {
            if (animal.getAnimalId() == animalNumber) {
                return animal;
            }
        }
        return null;
    }

    public Animal findAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }

    public void treatAnimal(int animalNumber) {
        Animal animal = findAnimal(animalNumber);
        if (animal != null && animal instanceof Treatable) {
            Treatable treatableAnimal = (Treatable) animal;
            treatableAnimal.treatAnimal();
        }
    }

    public void treatAnimal(String name) {
        Animal animal = findAnimal(name);
        if (animal != null && animal instanceof Treatable) {
            Treatable treatableAnimal = (Treatable) animal;
            treatableAnimal.treatAnimal();
        }
    }

    public void treatAllAnimals() {
        for (Animal animal : animals) {
            if (animal instanceof Treatable) {
                Treatable treatableAnimal = (Treatable) animal;
                treatableAnimal.treatAnimal();
            }
        }
    }

    public Animal findOldestAnimal() {
        if (animals.isEmpty()) {
            return null;
        }

        Animal oldestAnimal = animals.get(0);
        for (Animal animal : animals) {
            if (animal.getAge() > oldestAnimal.getAge()) {
                oldestAnimal = animal;
            }
        }
        return oldestAnimal;
    }

    public int countAnimals() {
        return animals.size();
    }
}

