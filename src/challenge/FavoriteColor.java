// Import - Scanner example
package challenge;

import java.util.Scanner;
public class FavoriteColor {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("What is your favorite color?");
    String color = input.nextLine();

    System.out.println( color + " is a nice color!");
    input.close();


    }
}
