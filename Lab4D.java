import java.util.Scanner;

public class Lab4D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gallons;
        float bill;
        System.out.print("Gallons of water: ");
        gallons = scan.nextInt();
        if (gallons < 1000)
        {
            bill = (float) (gallons * 0.15);
            System.out.print("Water bill is: $" + bill);
        }
        if ((gallons >= 1000) && (gallons <= 2000))
        {
            bill = (float) (gallons * 0.25);
            System.out.print("Water bill is: $" + bill);
        }
        if (gallons > 2000)
        {
            bill = (float) ((gallons - 2000) * 0.35 + (1000 * 0.15)+ (1000 * 0.25));
            System.out.print("Water bill is: $" + bill);
        }
    }
}
