import java.util.*;
public class Assignment7A {

    public static void averageWeek(int[][] arr)
    {   double sum[]=new double[4];
        for(int i=0;i<=3;i++)
        {
            sum[i]=0.0;
        }
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=6;j++)
            {
                sum[i]=sum[i]+arr[i][j];
            }
        }
        System.out.println("Week#\tAverage Weekly Temperature");
        System.out.println("---------------------------------------");
        for(int i=0;i<=3;i++)
        {
            System.out.println((i+1)+"                   "+(int)(sum[i]/7));
        }

    }
    public static double averageMonth(int[][] arr)
    {
        double sumMonth=0.0;
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=6;j++)
            {
                sumMonth=sumMonth+arr[i][j];
            }
        }
        return (sumMonth/28);

    }

    public static void main(String args[]) {
        int arr[][] = new int[4][7];
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=6;j++)
            {
                arr[i][j]=(int)(Math.random()*101);
            }
        }
        System.out.println("Mon\tTue\tWed\tThu\tFri\tSat\tSun");
        System.out.println("---------------------------------------");

        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=6;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        averageWeek(arr);
        int temp=(int)averageMonth(arr);
        System.out.println();
        System.out.print("This month's average temperature is: "+temp);

    }
}