/* Description - The child class that inherits the main characteristics of 
   a common duck and also has Red Head Duck specific traits */

/* Implement the fly() and quack() functions from the Flyable and Quackable Interface 
   And the other traits like swim() and display() from Duck */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() { }

    YesFly flyObj = new YesFly();
    Quack quackObj = new Quack();

    public void quack() {
        quackObj.quack();
    }

    public void fly() {
        flyObj.fly();
    }

    public void display() {
        System.out.println("I am a Read Head Duck");
    }

}