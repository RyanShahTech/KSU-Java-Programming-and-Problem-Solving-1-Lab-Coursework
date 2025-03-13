import java.util.Scanner;
public class Lab9B {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {

        int arr[]=new int[10];

        initArray(arr);
        int choice=0;
        do {
            printMenu(arr);
            choice=scn.nextInt();
            switch(choice) {
                case 1:
                    enterNum(arr);
                    break;
                case 2:
                    printArray(arr);
                    break;
                case 3:
                    printSum(arr);
                    break;
                case 4:
                    initArray(arr);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        } while (choice!=5);
    }


    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(" | "+arr[i]);
        }
        System.out.println();
    }


    public static void initArray(int[] arr) {
        for(int i=0;i<arr.length;i++)
            arr[i]=0;
    }


    public static void printSum(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum=sum+arr[i];
        System.out.println(sum);

    }


    public static void enterNum(int[] arr) {
        int slot,value;
        System.out.print("Enter the slot: ");
        slot=scn.nextInt();
        System.out.print("Enter the new value: ");
        value=scn.nextInt();

        if(slot<arr.length) {
            arr[slot]=value;
        }
        else {
            System.out.println("slot is not valid");
        }
    }


    public static void printMenu(int[] arr) {
        System.out.println("Would you like to:");
        System.out.println("1) Enter a number");
        System.out.println("2) Print the array");
        System.out.println("3) Find the sum of the array");
        System.out.println("4) Reset the array");
        System.out.println("5) Quit");
    }
}