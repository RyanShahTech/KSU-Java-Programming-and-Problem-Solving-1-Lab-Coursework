import java.util.Scanner;

public class Lab10A {


    public static int replaceVowels(String text) {

        int vowels = 0;
        String replaced = "";
        char letter;
        for (int i = 0; i < text.length(); i++) {
            letter = text.charAt(i);
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    replaced += "*";
                    vowels += 1;
                    break;
                default:
                    replaced += letter;
            }
        }

        System.out.println(replaced);
        return vowels;
    }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        int count = replaceVowels(text);
        System.out.println("That string has " + count + " vowels.");
    }

}
