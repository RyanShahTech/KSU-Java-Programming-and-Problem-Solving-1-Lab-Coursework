
import java.util.Scanner;
 class KoalaBear{

    public double weight;


    KoalaBear(double initialWeight){
        weight = initialWeight;
    }


    void eat(int leaves){
        weight += leaves*1.0/1000;
    }


    void showWeight(){
        System.out.println("This koala weighs "+weight+" kilos");
    }
}

class KoalaBearTest{

    public static void main(String[] args) {

        KoalaBear bear = new KoalaBear(100);

        bear.eat(400);
        bear.showWeight();
        bear.eat(300);
        bear.showWeight();
        bear.eat(650);
        bear.showWeight();
    }
}