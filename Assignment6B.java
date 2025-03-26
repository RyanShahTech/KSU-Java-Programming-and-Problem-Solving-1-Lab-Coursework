import java.util.Scanner;

public class Assignment6B
{

    public static float money(float dollars) {
        float amount = dollars * 0.85f;
        return amount;
    }


    public static float weight(float pounds) {
        float kilograms = pounds * 0.45f;
        return kilograms;
    }


    public static float length(float miles) {
        float kilometers = miles * 1.60934f;
        return kilometers;
    }


    public static int newTime(int time, int am_pm) {
        if(am_pm == 0) {
            return time;
        }
        else {
            return time + 12;
        }
    }


    public static float newTemp(float fahrenheit) {
        float celsius = (fahrenheit - 32) / 1.8f;
        return celsius;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ch;
        String retry;
        float dollars, pounds, miles, fahrenheit;
        int time, am_pm;

        do {
            System.out.println("Choose an option: 1)Convert currency  2) Convert weight  3) Convert");
            System.out.println("distance  4) Convert time  5) Convert temperature");
            ch = input.nextInt();

            switch(ch)
            {
                case 1: System.out.println("Enter dollars");
                    dollars = input.nextFloat();
                    System.out.println("Your money in euros is " + money(dollars));
                    break;
                case 2: System.out.println("Enter pounds");
                    pounds = input.nextFloat();
                    System.out.println("The weight in kilograms is " + weight(pounds));
                    break;
                case 3: System.out.println("Enter the length in miles");
                    miles = input.nextFloat();
                    System.out.println("The length in kilometers is " + length(miles));
                    break;
                case 4: System.out.println("Enter the time");
                    time = input.nextInt();
                    System.out.println("If this is before noon press 0. If this is after noon, press 1");
                    am_pm = input.nextInt();
                    System.out.println("The time in 24 hour format is " + newTime(time, am_pm));
                    break;
                case 5: System.out.println("Enter temperature ");
                    fahrenheit = input.nextFloat();
                    System.out.println("The temperature in Celsius is " + newTemp(fahrenheit));
                    break;
                default:System.out.println("Invalid option!");

            }

            System.out.println("Would you like to retry? (Y/N)");
            retry = input.next();

        } while(retry.equalsIgnoreCase("y"));
    }
}

