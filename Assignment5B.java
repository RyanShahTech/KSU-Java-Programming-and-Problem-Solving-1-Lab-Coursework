import java.util.*;
public class Assignment5B {

    public static boolean linearSearch(char ch,String str){
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str ;
        String vowels="aeiou",consonants="bcdfghjklmnpqrstvwxyz",numbers="0123456789";
        int vowels_count = 0, consonants_count = 0, numbers_count=0;
        System.out.print("Enter a string:");
        str=sc.nextLine();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);

            if (linearSearch(ch,vowels)) {
                vowels_count++;
            }

            else if (linearSearch(ch,consonants)) {
                consonants_count++;
            }

            else if (linearSearch(ch,numbers)) {
                numbers_count++;
            }
        }
        System.out.println("Number of vowels is: " + vowels_count);
        System.out.println("Number of consonants is: " + consonants_count);
        System.out.println("Number of numbers is: " + numbers_count);
    }
}