import java.util.Scanner;
public class Lab7A
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] a= new int[size];
        int i=0;
        for(i=0;i<size;i++){
            a[i]=i*i;
        }
        for(i=0;i<size;i++)
            System.out.print("|"+a[i]);
    }
}
