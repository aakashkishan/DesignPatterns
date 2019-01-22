/* Description - The child class that inherits the main characteristics of 
   a common duck and also has Rubber Duck specific traits */

/* The Rubberduck can neither fly nor quack. It cannot fly and it squeaks */
   public class RubberDuck extends Duck {

    public RubberDuck() { }

    public void quack() {
        System.out.println("I Squeak");
    }

    public void fly() {
        System.out.println("I cannot Fly");
    }

    public void display() {
        System.out.println("I am a Rubber Duck ");
    }

}
