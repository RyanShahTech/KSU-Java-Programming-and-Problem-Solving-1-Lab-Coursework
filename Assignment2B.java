import java.util.Scanner;
public class Assignment2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Width, Length, area;
        float dtc, feet;
        System.out.print("Width: ");
        Width = sc.nextInt();
        System.out.print("Length: ");
        Length = sc.nextInt();
        System.out.print("Square feet per dot: ");
        feet = sc.nextInt();
        area = Length * Width;
        dtc = area / feet;
        System.out.println("A yard of " + "" + area + " " + "square feet will take" + " " + dtc + " " + "dots to cut." );
    }
}
