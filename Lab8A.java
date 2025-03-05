import java.util.Scanner;

public class Lab8A {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int[] arr=new int[10];

        for(int i=0;i<10;i++) {

            System.out.print("Enter slot "+i+": ");

            arr[i]=sc.nextInt();
        }

        int swapcount=0;

        for(int i=0;i<10;i++) {

            for(int j=0;j<10-i-1;j++) {

                if(arr[j]>arr[j+1]) {

                    swapcount++;

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

            for(int k=0;k<10;k++) {
                System.out.print(arr[k]+"|");
            }

            System.out.println(" Num swaps: "+swapcount);
        }
    }
}
