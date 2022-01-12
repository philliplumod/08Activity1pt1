package main;
 
import java.io.PrintStream;

    public class Main {
    public static void main(String[] args) {
        Carnivore myAnimal = new Animal() {};
        myAnimal.eatGrass();
        System.out.println(myAnimal.chew());
    }

}


