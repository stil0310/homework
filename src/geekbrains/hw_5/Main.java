package geekbrains.hw_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);


        Dog dog = new Dog("Бобик", 500, 0.5, 10);
        Dog dog2 = new Dog("Шарик", 600, 0.5, 10);
        Horse horse = new Horse("Грыжа", 1500, 3, 100);
        Bird bird = new Bird("Кеша", 5, 0.2, 0);
        Cat cat = new Cat("Мурка", 200, 2, 0);

        dog.run(4000);
        dog2.run(600);
        horse.swim(20);
        bird.jump(1);
        cat.swim(5);

    }
}
