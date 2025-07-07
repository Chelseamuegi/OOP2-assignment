package Challenges.Challenge5_Whileloop;
// loop example
import java.util.*;
public class WhileLoop {
    Scanner input = new Scanner(System.in);

     public void showAnswer() {
        String answer;

        System.out.println("This message will repeat while you type 'yes'.");
        answer = input.next();
        while ("yes".equals(answer)) {
            System.out.println("Do you want to continue?");
            answer = input.next();
        }
    }
    public static void main(String[] args) {
         WhileLoop Loop = new WhileLoop();
         Loop.showAnswer();
    }


}
