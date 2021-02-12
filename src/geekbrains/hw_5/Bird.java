package geekbrains.hw_5;

import geekbrains.hw_5.Animal;

class Bird extends Animal {

    Bird(String name, double animalDistanceRun, double animalDistanceJump, double animalDistanceSwim) {
        super(name, animalDistanceRun, animalDistanceJump, animalDistanceSwim);
    }

    public String getAnimalName() {
        return "Птица " + name + " ";
    }

    public void swim (double value) {
        System.out.println(getAnimalName() + " говорит: не умею плавать ");
    }
}

