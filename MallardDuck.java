/* Description - The child class that inherits the main characteristics of 
   a common duck and also has Mallard Duck specific traits */

/* Implement the fly() and quack() functions from the Flyable and Quackable Interface 
   And the other traits like swim() and display() from Duck */
public class MallardDuck extends Duck implements Flyable, Quackable {

    public MallardDuck() { }

    public void quack() {
        System.out.println("I Quack");
    }

    public void fly() {
        System.out.println("I can Fly");
    }

    public void display() {
        System.out.println("I am a Mallard Duck");
    }

}
