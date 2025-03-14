import java.util.*;

public class Lab10C
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.nextLine();
        String output = "";
        int ch;
        for(int i = 0; i < input.length(); i++){
            ch = (int)input.charAt(i);
            if(97 <= ch && ch <= 122){
                output = output + (char)((ch - 97 + 13)%26 + 97);
            }
            else{
                output = output + (char)ch;
            }
        }
        System.out.println(output);
    }
}
