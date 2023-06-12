package animal;

import AnimalShelter.Disease;

import java.util.HashMap;
import java.util.Map;

public class Animal implements Vaccinateable {
    private static int animalIdCounter = 1;

    private int animalId;
    private Map<Disease, Boolean> isVaccinated;
    private boolean isClean;
    private int age;
    private String name;

    public Animal() {
        this.animalId = animalIdCounter++;
        this.isVaccinated = new HashMap<>();
        this.isClean = false;
    }

    public Animal(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public int getAnimalId() {
        return animalId;
    }

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }

    public boolean isClean() {
        return isClean;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setIsClean(boolean isClean) {
        this.isClean = isClean;
    }

    @Override
    public void vaccinateAnimal(Disease disease) {
        isVaccinated.put(disease, true);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalId=" + animalId +
                ", isVaccinated=" + isVaccinated +
                ", isClean=" + isClean +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}