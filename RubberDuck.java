/* Description - The child class that inherits the main characteristics of 
   a common duck and also has Rubber Duck specific traits */

/* The Rubberduck can neither fly nor quack. It cannot fly and it squeaks */
// Duplicates of the non-abstract functions fly() and quack() are created
// The function swim() from the class Duck remains unchanged

/* Implement the fly() and quack() functions from the Flyable and Quackable Interface 
   And the other traits like swim() and display() from Duck */

   public class RubberDuck extends Duck implements Flyable, Quackable{

    public RubberDuck() { }

    NoFly flyObj = new NoFly();
    Squeak quackObj = new Squeak();

    public void quack() {
        quackObj.quack();
    }

    public void fly() {
        flyObj.fly();
    }

    public void display() {
        System.out.println("I am a Rubber Duck ");
    }

}
