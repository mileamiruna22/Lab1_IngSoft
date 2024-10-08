package Logic;

public class Animal implements Somn {

    String nume;

    public Animal() {
    }

    public Animal(String nume) {
        this.nume = nume;
    }

    public void mananca(){
        System.out.println(this.nume);
    }

    @Override
    public void dorm() {
        System.out.println(this.nume + " doarme");
    }
}
