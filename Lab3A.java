import java.util.Scanner;
class Lab3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount_owed;
        float APR;
        float Minimum;
        System.out.println("Amount owed: $ ");
        amount_owed = sc.nextInt();
        System.out.print("APR: ");
        APR = sc.nextFloat();
        float monthlypay = APR/12;
        float minpay = (amount_owed * (APR/12))/100;
        System.out.println("Monthly percentage Rate: " + monthlypay );
        System.out.println("Minimum payment: $ " + minpay);
    }
}

