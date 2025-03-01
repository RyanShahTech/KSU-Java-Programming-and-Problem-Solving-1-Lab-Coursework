import java.util.Scanner;
class Lab3B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float course_1_hours;
        float course_2_hours;
        float course_3_hours;
        float course_4_hours;
        float course_1_grade;
        float course_2_grade;
        float course_3_grade;
        float course_4_grade;
        System.out.println("Course 1 hours: ");
        course_1_hours = sc.nextFloat();
        System.out.print("Grade for course 1: ");
        course_1_grade = sc.nextFloat();
        System.out.println("Course 2 hours: ");
        course_2_hours = sc.nextFloat();
        System.out.print("Grade for course 2: ");
        course_2_grade = sc.nextFloat();
        System.out.println("Course 3 hours: ");
        course_3_hours = sc.nextFloat();
        System.out.print("Grade for course 3: ");
        course_3_grade = sc.nextFloat();
        System.out.println("Course 4 hours: ");
        course_4_hours = sc.nextFloat();
        System.out.print("Grade for course 4: ");
        course_4_grade = sc.nextFloat();
        float hours = course_1_hours + course_2_hours + course_3_hours + course_4_hours;
        System.out.println("Total hours is: " + hours );
        float points =  course_1_hours * course_1_grade + course_2_hours * course_2_grade + course_3_hours * course_3_grade + course_4_hours * course_4_grade;
        System.out.println("Total quality points is: " + points );
        float GPA = (points/hours);
        System.out.println("Your GPA for this semester is " + GPA );
    }
}
