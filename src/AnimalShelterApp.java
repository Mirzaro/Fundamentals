



import animal.*;
import AnimalShelter.Disease;
import AnimalShelter.*;


public class AnimalShelterApp {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();

        // Aanmaken en toevoegen van 10 dieren aan de AnimalShelter
        Animal animal1 = new Cat("Fluffy", 3);
        Animal animal2 = new Dog("Buddy", 5);
        Animal animal3 = new Animal("Dio",100);
        Animal animal4 = new Cat("Whiskers", 4);
        Animal animal5 = new Dog("Max", 6);
        Animal animal6 = new Animal("Jean",5);
        Animal animal7 = new Cat("Luna", 2);
        Animal animal8 = new Dog("Charlie", 4);
        Animal animal9 = new Animal("Oscar", 3);
        Animal animal10 = new Cat("Simba", 5);

        animalShelter.addAnimal(animal1);
        animalShelter.addAnimal(animal2);
        animalShelter.addAnimal(animal3);
        animalShelter.addAnimal(animal4);
        animalShelter.addAnimal(animal5);
        animalShelter.addAnimal(animal6);
        animalShelter.addAnimal(animal7);
        animalShelter.addAnimal(animal8);
        animalShelter.addAnimal(animal9);
      animalShelter.addAnimal(animal10);

        // Testen van de verschillende methoden van de AnimalShelter
        AnimalShelterApp.sortAnimals();
        System.out.println("Dieren gesorteerd op animalNumber:");
        animalShelter.printAnimals();
        System.out.println();

        animalShelter.sortAnimalsByName();
        System.out.println("Dieren gesorteerd op naam:");
        animalShelter.printAnimals();
        System.out.println();

        animalShelter.sortAnimalsByAge();
        System.out.println("Dieren gesorteerd op leeftijd:");
        animalShelter.printAnimals();
        System.out.println();

        System.out.println("Dieren die niet gevaccineerd zijn voor Chickenpox:");
        animalShelter.printAnimalsNotVaccinated(Disease.CHICKENPOX);
        System.out.println();

        Animal foundAnimal1 = animalShelter.findAnimal(3);
        if (foundAnimal1 != null) {
            System.out.println("Gevonden dier op basis van animalNumber: " + foundAnimal1);
        } else {
            System.out.println("Dier niet gevonden op basis van animalNumber.");
        }
        System.out.println();

        Animal foundAnimal2 = animalShelter.findAnimal("Buddy");
        if (foundAnimal2 != null) {
            System.out.println("Gevonden dier op basis van naam: " + foundAnimal2);
        } else {
            System.out.println("Dier niet gevonden op basis van naam.");
        }
        System.out.println();

        animalShelter.treatAnimal(4);
        animalShelter.treatAnimal("Coco");
        animalShelter.treatAllAnimals();
        System.out.println();

        Animal oldestAnimal = animalShelter.findOldestAnimal();
        System.out.println("Oudste dier in de AnimalShelter: " + oldestAnimal);
        System.out.println();

        int animalCount = animalShelter.countAnimals();
        System.out.println("Aantal dieren in de AnimalShelter: " + animalCount);
    }

    private static void sortAnimals() {

    }
}
