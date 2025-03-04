import java.util.Scanner;

public class Lab7C
{

    public static void main(String []ss)
    {

        Scanner sc = new Scanner(System.in);


        boolean flag = true;


        System.out.print("\n Enter the size of the arrays: ");
        int size = sc.nextInt();


        int[] arrayOne = new int[size];
        int[] arrayTwo = new int[size];


        for(int c = 0; c < size; c++)
        {
            System.out.print("\n Enter Array 1 slot " + c + ": ");

            arrayOne[c] = sc.nextInt();

            System.out.print("\n Enter Array 2 slot " + c + ": ");

            arrayTwo[c] = sc.nextInt();
        }


        for(int c = 0; c < size; c++)
        {

            if(arrayOne[c] != arrayTwo[c])
            {

                flag = false;

                break;
            }
        }


        if(flag)
            System.out.print("\n The arrays are identical");


        else
            System.out.print("\n The arrays are not identical");

        sc.close();
    }
}