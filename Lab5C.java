import java.util.Scanner;
public class Lab5C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;
        System.out.print("Enter x: ");
        x = scan.nextInt();
        System.out.print("Enter y: ");
        y = scan.nextInt();
        if (x== 0 && y==0){
            System.out.print("This point is the origin.");
        }
        else if (x== 0 && y!=0){
            System.out.print("This point is on the y axis.");
        }
        else if (x!=0 && y== 0){
            System.out.print("This point is on the x axis.");
        }
        else if (x > 0 && y > 0) {
            System.out.println("This point is in the first quadrant.");
        } else if (x > 0) {
            System.out.println("This point is in the fourth quadrant.");
        } else if (y > 0) {
            System.out.println("This point is in the second quadrant.");
        } else {
            System.out.println("This point is in the third quadrant.");
        }
    }
}
