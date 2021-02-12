package geekbrains.hw_5;

import geekbrains.hw_5.Animal;

class Cat extends Animal {

    Cat(String name, double animalDistanceRun, double animalDistanceJump, double animalDistanceSwim) {
        super(name, animalDistanceRun, animalDistanceJump, animalDistanceSwim);
    }

    public String getAnimalName() {
        return "Киса " + name + " ";
    }
    public void swim (double value) {
        System.out.println(getAnimalName() + " говорит: не умею плавать ");
    }
}
