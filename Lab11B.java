import java.util.Scanner;
class Turtle
{
    int speed;
    String color;
    Turtle(){
        speed = 0;
        color = "green";
    }

    Turtle(int s, String c){
        speed = s;
        color = c;
    }
    public static class Lab11B{
        public static void main(String[] args) {
            Turtle turtle1 = new Turtle();
            Turtle turtle2 = new Turtle(5,"purple");

            System.out.println(turtle1.speed);
            System.out.println(turtle2.color);

        }

    }
}


