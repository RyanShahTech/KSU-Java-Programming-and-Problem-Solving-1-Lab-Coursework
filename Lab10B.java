import java.util.Scanner;

public class Lab10B {
    public static void removeOffensive(String s) {
        while (s.contains("dang")){
            int index = s.indexOf("dang");
            System.out.println("Found bad word at: " + index);
            s = s.replaceFirst("dang", "&^#@");
        }
        System.out.print(s);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        System.out.print("Enter a string: ");
        s = sc.nextLine();
        removeOffensive(s);



    }
}
