import java.util.*;
public class Main{
    public static void main(String[]args){
        HelloTillStop helloTillStop = new HelloTillStop();
        helloTillStop.showHello();
}




public static class HelloTillStop {
    Scanner sc =new Scanner(System.in);


    void showHello(){
        String choice;

        System.out.println("For Hello type h, anything else to stop");
        choice = sc.next();
        while ("h".equals(choice)){
            System.out.println("Hello");
            choice = sc.next();
        }
    }
    }
}