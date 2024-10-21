
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите через пробел: число голов, " +
                "которые меч срубает одним ударом, число голов дракона" +
                "и число голов, которые дракон регенерирует за раз ");
        Scanner inn = new Scanner(System.in);
        String [] data = inn.nextLine().split(" ");
        battle(data);

    }
    public static void battle(String[] data) {
        int powerSword = Integer.parseInt(data[0]);
        int dragonHeads = Integer.parseInt(data[1]);
        int regeneration = Integer.parseInt(data[2]);
        int counBattle;
        if (regeneration > powerSword & dragonHeads > powerSword) {
            System.out.println("Принцу не выиграть бой");
        } else {
            for (counBattle = 1; ; counBattle++) {
                dragonHeads = (dragonHeads - powerSword);
                if (dragonHeads <= 0) {
                    break;
                }
                dragonHeads += regeneration;
            }
            System.out.println("Число ударов, которые необходимо нанести принцу, чтобы убить дракона: " + counBattle);
        }
    }
}
