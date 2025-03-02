import java.util.Scanner;
public class Lab4B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours, earning, excesshour = 0;
        System.out.print("Number of hours this week: ");
        hours = sc.nextInt();
        if(hours<=40) {
            earning = hours * 15;
        }
        else {
            excesshour = hours - 40; // 50-40 = 10;

            earning = (excesshour * 25) + (40 * 15); // 10 * 25 + 40 * 15
        }
        System.out.print("Earnings: $ " + earning);
    }
}
