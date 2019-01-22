/* Description - The parent class that maintains the various main traits of ducks */


/* Duck traits : Apart from the Initial Quack, Swim and Display, 
   a Fly trait has been added. This fly trait even though inherited 
   by most of the duck types, is not inherited by the RubberDuck. */
public abstract class Duck {

    public Duck() {}

    public void quack() {
        System.out.println("I Quack");
    }

    public void swim() {
        System.out.println("I can Swim");
    }

    public void fly() {
        System.out.println("I can Fly");
    }

    public void display() {}

}