import java.util.Scanner;


public class Lab7B
{

    public static void main(String [] arg)
    {

        Scanner sc = new Scanner(System.in);


        System.out.print("\n Enter the number of GPAs: ");
        int size = sc.nextInt();


        double[] gpa = new double[size];


        for(int c = 0; c < size; c++)
        {
            System.out.print("\n GPA #" + c + ": ");

            gpa[c] = sc.nextDouble();
        }


        for(int c = 0; c < gpa.length; c++)
        {

            if(gpa[c] >= 3.90 && gpa[c] <= 4.00)

                System.out.print("\n Student #" + c + ": Summa Cum Laude");


            else if(gpa[c] >= 3.70 && gpa[c] <= 3.899)

                System.out.print("\n Student #" + c + ": Magna Cum Laude");


            else if(gpa[c] >= 3.50 && gpa[c] <= 3.699)

                System.out.print("\n Student #" + c + ": Cum Laude");


            else if(gpa[c] >= 2.30 && gpa[c] <= 3.499)

                System.out.print("\n Student #" + c + ": Graduating");


            else

                System.out.print("\n Student #" + c + ": Not graduating");
        }

        sc.close();
    }
}



