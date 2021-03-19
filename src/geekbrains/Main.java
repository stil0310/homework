package geekbrains;

public class Main {

    public static void main(String[] args) {
        JumpableRunnable[] members = {
                new Human(2, 2, "Митя"),
                new Human(1, 2, "Ваня"),
                new Cat(3, 4, "Мурка"),
                new Cat(1, 1, "Дымка"),
                new Robot(0, 10, 111111),
                new Robot(4,7,22222)
        };

        Obstaclable[] obstacles = {
                new RunningTrack(1),
                new RunningTrack(4),
                new Wall(1),
                new Wall(3)
        };

        for (JumpableRunnable member : members) {
            System.out.println("К прохождению препятствий приступает " + member);
            boolean winner = true;
            for (Obstaclable obstacle : obstacles) {
                System.out.println(member + " пробует пройти " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("У него получается!");
                } else {
                    winner = false;
                    System.out.println("У него не получается.");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " прошёл дистанцию!");
            } else {
                System.out.println(member + " проиграл.");
            }
            System.out.println();
        }
    }
}
