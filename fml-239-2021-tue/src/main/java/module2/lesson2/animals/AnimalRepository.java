package module2.lesson2.animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {

    private final List<Animal> animals;

    public AnimalRepository() {
        animals = new ArrayList<>(
                List.of(
                        new Cat(),
                        new Cat(),
                        new Cat()
                )
        );
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public Animal getAnimalById(long id) {
        return animals.stream()
                .filter(animal -> animal.getId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException(
                        "Animal with id " + id + " not found"));
    }

}
