import java.util.Scanner;

public class Lab6A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cookie;
        do {
            System.out.print("Gimme a cookie: ");
            cookie = sc.nextLine();
        } while (!cookie.equals("cookie"));
    }
}