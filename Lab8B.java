import java.util.Scanner;

class Lab8B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        int key;

        for(int i = 0; i < 15; i++){
            System.out.print("Enter slot " + i + ": " );
            arr[i] = sc.nextInt();
        }
        System.out.print("\nEnter a target: ");
        key = sc.nextInt();
        printArr(arr);
        linearSearch(arr, key);
        binarySearch(arr, key);
    }

    public static void printArr(int[] arr){
        System.out.println(" ");
        for(int i = 0; i < 15; i++){
            System.out.print(arr[i] + "|");
        }
    }

    public static void linearSearch(int[] arr, int key){
        System.out.println(" ");
        for (int i = 0; i < 15; i++) {
            if (arr[i] == key){
                System.out.print(i + " ");
                return;
            }
            else{
                System.out.print(i + " ");
            }
        }
    }

    public static void binarySearch(int[] arr, int key){
        System.out.println(" ");
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == key) {
                System.out.print(m + " ");
                return;
            }
            if (arr[m] < key) {
                System.out.print(m + " ");
                l = m + 1;
            }
            else {
                System.out.print(m + " ");
                r = m - 1;
            }
        }
    }
}
