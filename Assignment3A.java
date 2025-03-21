import java.util.Scanner;

public class Assignment3A
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter guest 1:");
        String guest1=sc.next();
        System.out.println();
        System.out.print("Enter guest 2:");
        String guest2=sc.next();
        System.out.println();
        if((guest1.equals("Taylor") && guest2.equals("Fernando")) || (guest2.equals("Taylor") && guest1.equals("Fernando")))
            System.out.println("Your party is ruined and another bad pop song will be written. ");
        else
            System.out.println("Your party was a hit! ");
    }
}
