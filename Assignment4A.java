import java.util.Scanner;

public class Assignment4A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String inputName, highestScorer = "";

        int inputScore, highestScore = 0;

        int numStudents;


        System.out.print("Enter the number of students: ");
        numStudents = input.nextInt();
        input.nextLine();


        System.out.println("Enter each student name and test score");
        for(int i=1; i<=numStudents; i++)
        {

            System.out.println("Student: "+i);
            System.out.print("Name: ");
            inputName = input.nextLine();

            System.out.print("Score: ");
            inputScore = input.nextInt();
            input.nextLine();


            if(inputScore > highestScore)
            {

                highestScore = inputScore;
                highestScorer = inputName;
            }
        }

        System.out.println("Student with the highest score: "+highestScorer);
    }
}
