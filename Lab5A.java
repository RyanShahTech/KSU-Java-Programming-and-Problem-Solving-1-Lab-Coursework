import java.util.Scanner;

class Lab5A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Experiencing severe symptoms (Y/N)? ");
        char symptoms = in.next().charAt(0);

        if (symptoms == 'y' || symptoms == 'Y') {
            System.out.println("Seek emergency care.");
        } else {
            System.out.print("Close contact with someone who has COVID (Y/N)? ");
            char contact = in.next().charAt(0);
            if (contact == 'y' || contact == 'Y') {
                System.out.println("Quarantine and get tested if you feel sick.");
            } else {
                System.out.println("If you experience other symptoms, isolate and get tested.");
            }
        }
    }
}
