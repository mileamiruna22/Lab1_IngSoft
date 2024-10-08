import Logic.Animal;
import Logic.Pisica;

public class Main {
    public static void main(String[] args) {
        //System.out.printf("Hello world!");
        Animal x = new Animal();
        //x.mananca();
        Animal y = new Pisica("Felix");
        y.mananca();
        y.dorm();

    }
}
