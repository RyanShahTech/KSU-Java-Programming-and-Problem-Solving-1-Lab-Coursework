import java.util.Scanner;

public class Lab9A {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {

        int x,y,z;
        System.out.print("Enter number 1: ");
        x=scn.nextInt();
        System.out.print("Enter number 2: ");
        y=scn.nextInt();
        System.out.print("Enter number 3: ");
        z=scn.nextInt();
        int min=min(x, y, z);
        int max=max(x, y, z);
        double average=average(x, y, z);
        System.out.println("Min is "+min);
        System.out.println("Max is "+max);
        System.out.println("Average is "+average);

    }

    public static int max(int x,int y,int z) {
        if(x>y && x>z)
            return x;
        else if(y>z)
            return y;
        else
            return z;
    }


    public static int min(int x,int y,int z) {
        if(x<y && x<z)
            return x;
        else if(y<z)
            return y;
        else
            return z;
    }


    public static double average(int x,int y,int z) {
        float sum=(x+y+z);
        double average=sum/3.0;
        return average;
    }




}