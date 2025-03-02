
import java.util.Scanner;
public class Lab4C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Select from the following:\n" + "To see a list of movies, press 1.\n" + "To see show times, press 2.\n" + "To pay your bill, press 3.\n" + "Choice:");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The Neverending Story 6\n" + "Princess Diaries: the untold story\n" + "Monty Python and the Programmer");
                break;
            case 2:
                System.out.print("All movies play at 3PM.");
                break;
            case 3:
                System.out.println("Corporate accounts payable, Nina speaking.\n" + "Just a moment!");
                break;
            default:
                System.out.print("I'm sorry, Dave. I can't do that.");
        }
    }
}
