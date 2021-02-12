package geekbrains.hw_5;

import geekbrains.hw_5.Animal;

class Horse extends Animal {

    Horse(String name, double animalDistanceRun, double animalDistanceJump, double animalDistanceSwim) {
        super(name, animalDistanceRun, animalDistanceJump, animalDistanceSwim);
    }

    public String getAnimalName() {
        return "Лошадь " + name + " ";
    }
}
