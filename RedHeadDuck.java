/* Description - The child class that inherits the main characteristics of 
   a common duck and also has Red Head Duck specific traits */

public class RedHeadDuck extends Duck implements Flyable, Quackable {

    public RedHeadDuck() { }

    public void quack() {
        System.out.println("I Quack");
    }

    public void fly() {
        System.out.println("I can Fly");
    }

    public void display() {
        System.out.println("I am a Read Head Duck");
    }

}