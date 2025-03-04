import java.util.Scanner;

class Lab6C {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a starting number: ");
        int start = in.nextInt();
        System.out.print("Enter an ending number: ");
        int end = in.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 1)
                sum += i;
        }
        System.out.println("Sum of odds is: " + sum);
    }
}
