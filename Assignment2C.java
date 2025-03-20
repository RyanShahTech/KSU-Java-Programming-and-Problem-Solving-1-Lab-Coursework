import java.util.Scanner;
public class Assignment2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horizontal, vertical;
        double inches;
        System.out.print("Horizontal pixels: ");
        horizontal = sc.nextInt();
        System.out.print("Vertical pixels: ");
        vertical = sc.nextInt();
        System.out.print("Diagonal length in inches: ");
        inches = sc.nextDouble();
        int Diagonal_pixel;
        Diagonal_pixel = (int) Math.sqrt((horizontal * horizontal) + (vertical * vertical));
        int PPI;
        PPI = (int)(Diagonal_pixel/inches);
        System.out.println("Pixels per inch: " + PPI);


    }
}
