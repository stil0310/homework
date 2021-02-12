package geekbrains.hw_5;

public abstract class Animal implements AnimalInterface {
    private double animalDistanceRun, animalDistanceJump, animalDistanceSwim;
    protected String name;

    Animal(String name, double animalDistanceRun, double animalDistanceJump, double animalDistanceSwim) {
        this.name = name;
        this.animalDistanceRun = animalDistanceRun;
        this.animalDistanceJump = animalDistanceJump;
        this.animalDistanceSwim = animalDistanceSwim;
    }

    @Override
    public String getAnimalName() {
        return "Животное " + name + " ";
    }

    @Override
    public void run(double value) {
       if(value > animalDistanceRun) {
           System.out.println(getAnimalName() + " говорит: не могу пробежать " + value + ". Ограничение " + animalDistanceRun);
       } else {
           System.out.println(getAnimalName() + " говорит: Пробежал " + value);
       }
    }

    @Override
    public void jump(double value) {
        if(value > animalDistanceJump) {
            System.out.println(getAnimalName() + " говорит: не могу перепрыгнуть препятствие " + value + ". Ограничение " + animalDistanceJump);
        } else {
            System.out.println(getAnimalName() + " говорит: Перепрыгнул препятствие " + value);
        }

    }

    @Override
    public void swim(double value) {
        if(value > animalDistanceSwim) {
            System.out.println(getAnimalName() + " говорит: не могу плыть " + value + ". Ограничение " + animalDistanceSwim);
        } else {
            System.out.println(getAnimalName() + " говорит: Проплыл " + value);
        }
    }
    double getAnimalDistanceRun() {
        return animalDistanceRun;
    }

    double getAnimalDistanceJump() {
        return animalDistanceJump;
    }

    double getAnimalDistanceSwim() {
        return animalDistanceSwim;
    }
}
