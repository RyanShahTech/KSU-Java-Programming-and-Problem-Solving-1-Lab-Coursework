import java.util.Scanner;

public class Lab6B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=-1001;
        int min=1001;
        System.out.print("Enter a number between -1000 and +1000: ");
        int num = sc.nextInt();
        while(num!=0) {
            if(num>max)
                max=num;
            if(num<min)
                min=num;
            System.out.println("Min is "+min+" Max is "+max);
            System.out.print("Enter a number between -1000 and +1000: ");
            num = sc.nextInt();
        }
        if(max!=-1001) {
            System.out.println("Min is "+min+" Max is "+max);
        }

    }
}
