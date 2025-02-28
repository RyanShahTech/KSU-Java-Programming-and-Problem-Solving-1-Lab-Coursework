/*
Class: CSE 1321L
Section: J63
Term: Spring 2021
Instructor: Deeksha Kaya
Name: Ryan Shah
Lab#: Lab 2A
*/

import java.util.Scanner;
public class Lab2A
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName, userName2, verb, adverb;
        System.out.println(" Enter a name:");
        userName = sc.nextLine();
        System.out.println("Enter another name:");
        userName2 = sc.nextLine();
        System.out.println("Enter a verb:");
        verb = sc.nextLine();
        System.out.println("Enter an adverb:");
        adverb = sc.nextLine();

        System.out.println("Once upon a time, there was a person named "
        + userName + " who had a child named " + userName2 + ". This child would " +
        verb  +  " "  + adverb  + " while singing to strangers.");
    }
}
