package geekbrains.hw_5;

import geekbrains.hw_5.Animal;

class Dog extends Animal {

     Dog(String name, double animalDistanceRun, double animalDistanceJump, double animalDistanceSwim) {
         super(name, animalDistanceRun, animalDistanceJump, animalDistanceSwim);
     }

    public String getAnimalName() {
        return "Собака " + name + " ";
    }
}
