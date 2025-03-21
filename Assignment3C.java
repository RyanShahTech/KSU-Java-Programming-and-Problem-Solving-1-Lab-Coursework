import java.util.Scanner;
public class Assignment3C {
    public static void main(String[] args){

        int numPeople;
        float cost;
        float tip;
        char choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people in your party? ");
        numPeople = sc.nextInt();

        System.out.println("What is the total cost of your bill? ");
        cost = sc.nextFloat();

        if(numPeople >= 6){
            cost = cost+(cost*18/100);
            System.out.println("Your bill is $"+cost);
            System.out.println("Would you like to include an additional tip (Y/N)? ");
            choice = sc.next().charAt(0);

            if(choice == 'y' || choice == 'Y'){
                System.out.println("How much? ");
                tip = sc.nextFloat();
                cost += tip;
            }
        }

        else{
            System.out.println("Your bill is $"+cost);
            System.out.println("How much for the tip? ");
            tip = sc.nextFloat();
            cost += tip;
        }

        System.out.println("Total bill is: $ " +cost);
}
}
