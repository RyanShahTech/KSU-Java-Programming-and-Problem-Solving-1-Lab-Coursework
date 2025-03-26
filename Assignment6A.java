import java.util.Scanner;

public class Assignment6A
{
    public static int average(int[]a, int n)
    {
        int sum=0;
        for(int i=0;i<5;i++)
            sum+=a[i];
        return (sum/5);
    }


    public static int pow(int a, int b)
    {
        int p=1;
        for(int i=1;i<=b;i++)
        {
            p*=a;
        }
        return p;
    }


    public static void power(int []a, int n)
    {
        for(int i=0;i<n-1;i++)
        {
            System.out.println("\n The power of " + a[i] + " raised to " + a[i+1] + " is " + pow(a[i], a[i+1]));
        }
        System.out.println("\n The power of " + a[n-1] + " raised to  " + a[0] + " is " + pow(a[n-1], a[0]));
    }


    public static boolean isPrime(int n)
    {
        if(n==0 || n==1)
            return false;
        for(int j=2;j*j<=n;j++)
        {
            if(n%j==0)
                return false;
        }
        return true;
    }


    public static void even(int []a, int n)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
                System.out.println(a[i] + " is even \n ");
            else
                System.out.println(a[i] + " is odd \n");
        }
    }


    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter 5 integers that are greater than 0: ");
        int[] a = new int[5];
        for(int i=0;i<5;i++)
            a[i]=scn.nextInt();


        System.out.println("Choose an option: 1) Find the average 2) Find the power 3) Is it prime? 4) Is it even or odd?");
        int ch;
        ch = scn.nextInt();


        switch(ch)
        {
            case 1: System.out.println("The average is " + average(a, 5));
                break;


            case 2: power(a, 5);
                break;


            case 3: for(int i=0;i<5;i++)
            {
                if(isPrime(a[i]))
                    System.out.println(a[i] + "  is prime \n ");
                else
                    System.out.println(a[i] + "  is not prime \n ");
            }
                break;


            case 4: even(a, 5);
                break;


            default: System.out.println("Wrong choice");

        }

    }
}
