import java.util.Random;
package week Three
public class Dice {
    public static void main(String[] args) {
        Random random = new Random();
        int roll1 = random.nextInt(5) + 1;
        int roll2 = random.nextInt(4) + 1;
        int roll3 = random.nextInt(6) + 1;
        int total = roll1 + roll2 + roll3;

        System.out.println("Dice roll: " + roll1 + " + " + roll2 + " + " + roll3);

        if ((roll1 == roll2) && (roll2 == roll3)) {
            System.out.println("You rolled triples! +8 bonus to total!");
            total += 6;
        } else if ((roll1 == roll2) || (roll2 == roll3) || (roll1 == roll3)) {
            System.out.println("You rolled doubles! +2 bonus to total!");
            total += 2;
        }

        System.out.println("Total score: " + total);

        if (total >= 15) {
            System.out.println("You win!");
        } else {
            System.out.println("Sorry, you lose.");
        }
    }
}
}
