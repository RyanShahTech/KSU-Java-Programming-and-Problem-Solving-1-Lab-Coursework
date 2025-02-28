/*
Class: CSE 1321L
Section: J63
Term: Spring 2021
Instructor: Deeksha Kaya
Name: Ryan Shah
Lab#: Lab 2B
*/

import java.util.Scanner;
public class Lab2C
{
     public static void main (String[] args) {
         Scanner scanner = new Scanner(System.in);

         int width;
         int height;
         int area;
         int perimeter;

         System.out.print("Enter a width: ");
         width = scanner.nextInt();

         System.out.print("Enter a height: ");
         height = scanner.nextInt();

         perimeter = 2*(height + width);
         area = height * width;

         System.out.println("The area is " + area);
         System.out.println("The perimeter is " + perimeter);
    }
}



