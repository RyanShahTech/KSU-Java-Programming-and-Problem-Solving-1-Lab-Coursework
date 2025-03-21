import java.util.Scanner;
public class Assignment3B
{
    public static void main(String[] args) {
        int number1,number2,result = 0;
        char operator;
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        number1 = sc.nextInt();


        System.out.print("Enter the second number: ");
        number2 = sc.nextInt();


        System.out.print("Enter the operator to apply: ");
        operator = sc.next().charAt(0);


        switch(operator){
            case '+':
                // if operator is +
                result = number1 + number2;
                break;
            case '-':
                // if operator is -
                result = number1 - number2;
                break;
            case '*':
                // if operator is *
                result = number1 * number2;
                break;
            case '%':
                // if operator is %
                result = number1 % number2;
                break;
            case '/':
                // if operator is /
                result = number1 / number2;
                break;
            default:
                // if user enter operator other than *,/,+,- and %
                System.out.println("Invalid operator");
                break;
        }

        System.out.print(result);
    }
}