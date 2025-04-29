package challenge;
// Import - Random example
import java.util.Random;
public class RandomExample{

    public void generateRandomNumber() {
        Random random = new Random();

        int randomNumber = random.nextInt(100);

        System.out.println("Today's lucky number is: " + randomNumber);
    }

    public static void main(String[] args) {
        RandomExample example = new RandomExample();
        example.generateRandomNumber();
    }

}
