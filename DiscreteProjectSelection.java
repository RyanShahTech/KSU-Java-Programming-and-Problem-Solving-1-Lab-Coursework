import java.util.Random;

import java.util.Scanner;

public class DiscreteProjectSelection

{



    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);



        System.out.println("Enter number: ");

        int n = sc.nextInt();



        int[] array = new int[n];

        Random rand= new Random();



        for(int i=0;i<n;i++){

            array[i] = rand.nextInt(100);

        }



        System.out.println("Before Selection sort:");

        for(int i=0;i<n;i++){

            System.out.print(array[i]+" ");

        }



        Selection_Sort(array,n);

    }



    public static void Selection_Sort(int array[], int size)

    {

        int p,q, minIndex,temp;



        for (p = 0; p< size-1; p++)

        {

            minIndex = p;

            for (q = p+1; q < size; q++)

            {

                if (array[q] < array[minIndex])

                {

                    minIndex = q;

                }

            }

            temp = array[minIndex];

            array[minIndex] = array[p];

            array[p] = temp;

        }



        System.out.println("\nAfter Selection sort: ");

        for(int i=0;i<size;i++){

            System.out.print(array[i]+" ");

        }

    }

}
