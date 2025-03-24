import java.util.Scanner;

public class Assignment4C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.print("Enter an integer: ");
        num = scan.nextInt();
        if(num==0){
        }
        else{
            for (int i=num;i>=1;i--){
                fact = fact*i;
            }
        }
        System.out.println("The Factorial of "+num+" is: "+fact);
    }
}
