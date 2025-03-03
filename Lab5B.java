import java.util.Scanner;
public class Lab5B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int today, nextmeeting, dayofweek;
        System.out.print("Enter a number that represents today (Sunday==0, Monday==1,...) ");
        today = scan.nextInt();
        System.out.print("Enter the number of days until the meeting: ");
        nextmeeting = scan.nextInt();

        dayofweek =(today+nextmeeting)%7;

        switch (dayofweek){
            case 0:
                System.out.print("Meeting day is Sunday");
                break;
            case 1:
                System.out.print("Meeting day is Monday ");
                break;
            case 2:
                System.out.print("Meeting day is Tuesday ");
                break;
            case 3:
                System.out.print("Meeting day is Wednesday ");
                break;
            case 4:
                System.out.print("Meeting day is Thursday ");
                break;
            case 5:
                System.out.print("Meeting day is Friday ");
                break;
            case 6:
                System.out.print("Meeting day is Saturday ");
                break;
        }

    }
}
