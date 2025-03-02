import java.util.Scanner;
public class Lab4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day;
        System.out.print("Enter the day: ");
        day = sc.next();
        if (day.equals("Monday"))
        System.out.print("Sounds like someone has a case of the Mondays!\n");
        else if(day.equals("Wednesday"))
        System.out.print("It's hump day! El ombligo!\n");
        else if(day.equals("Friday"))
        System.out.print("Finally. It's Friday!\n");
        else
        System.out.print("It's another day of the week.\n");

    }
}
