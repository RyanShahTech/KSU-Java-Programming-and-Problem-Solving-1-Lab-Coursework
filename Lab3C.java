import java.util.Scanner;
class Lab3C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quarter, dime, nickel, pennie, cent;
        System.out.print("Enter the number of quarters: ");
        quarter = sc.nextInt();
        System.out.print("Enter the number of dimes: ");
        dime = sc.nextInt();
        System.out.print("Enter the number of nickels: ");
        nickel = sc.nextInt();
        System.out.println("Enter the number of pennies: ");
        pennie = sc.nextInt();

        System.out.println("You entered" + " " + quarter + " " + "quarters.");
        System.out.println("\nYou entered" + " " + dime + " " + "dimes.");
        System.out.println("\nYou entered" + " " + nickel + " " + "nickels.");
        System.out.println("\nYou entered" + " " + pennie + " " + "pennies.");

        cent = 25 * quarter + 10 * dime  + 5 * nickel +1 * pennie;
        System.out.println("\nYour total is" + " " + cent / 100 + " " + "dollars and"+ " " + cent % 100 + " " + "cents.");
    }
}
