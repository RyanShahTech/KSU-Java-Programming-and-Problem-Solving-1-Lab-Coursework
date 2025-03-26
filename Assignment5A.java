import java.util.*;


class Assignment5A{

    public static void exchangeSort(String arr[])
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i].compareToIgnoreCase(arr[j])>0)
                {
                    String temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String arr[] = new String[5];
        System.out.println("Enter 5 names: ");
        for(int i=0; i<5; i++)
        {
            System.out.print("Name "+(i+1)+":");
            arr[i]=scan.next();
        }
        exchangeSort(arr);
        System.out.println("Names in order are: ");
        for(String str : arr)
        {
            System.out.print(str+" ");
        }
    }
}
