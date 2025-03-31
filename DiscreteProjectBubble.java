import java.util.Random;

import java.util.Scanner;

public class DiscreteProjectBubble

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



        System.out.println("Before Bubble sort:");

        for(int i=0;i<n;i++){

            System.out.print(array[i]+" ");

        }



        Bubble_Sort(array,n);

    }



    public static void Bubble_Sort(int array[], int size)

    {

        int temp;



        for (int c = 0 ; c < ( size - 1 ); c++)

        {

            for (int d = 0 ; d < size - c - 1; d++)

            {

                if (array[d] > array[d+1])

                {

                    temp = array[d];

                    array[d] = array[d+1];

                    array[d+1] = temp;

                }

            }

        }



        System.out.println("\nAfter Bubble sort: ");

        for(int i=0;i<size;i++){

            System.out.print(array[i]+" ");

        }

    }

}