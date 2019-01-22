/* Objectve - To Write and Understand a Strategy Pattern related java code
   Target - To accommodate the client's requests on a program classifying ducks */

import java.lang.*;
import java.io.*;

public class DuckSimulator {

    public static void main(String args[]) {

        MallardDuck mDuck = new MallardDuck();
        System.out.println("Mallard Duck Description: ");
        mDuck.quack();
        mDuck.swim();
        mDuck.display();

        RedHeadDuck rDuck = new RedHeadDuck();
        System.out.println("Red Head Duck Description: ");
        rDuck.quack();
        rDuck.swim();
        rDuck.display();

    }

}




