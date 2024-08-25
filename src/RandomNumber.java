import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    static void check(int answer, int randnum){
        if (answer < randnum ) {
            System.out.println("You've got " + answer + " \nThe Computer got " + randnum + "\nToo Low!");
        }else if (answer > randnum){
            System.out.println("You've got " + answer + " \nThe Computer got " + randnum + "\nToo High!");
        }
        else{
            System.out.println("You've got " + answer + " \nThe Computer got " + randnum + "\nCongratulations!");
        }
    }

    public static void main(String[] args) throws Exception {
        // Objects
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Variables
        int max = 100;
        int min = 1;
        int randnum = random.nextInt(max - min + 1) + min;
        // Start
        System.out.println("Welcome to Guess Random Number 1 - 100 Edition");
        System.out.print("Enter your Random Number: ");
        int answer = scanner.nextInt();
        check(answer, randnum);

    }
}
