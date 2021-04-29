// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a 13DTC assignment.
// You may not distribute it in any other way without permission.
import ecs100.*;

/**
 * Code for 13DTC
 * Name: Josh Clark
 * Date: 15/04/2021
 * Program to create simple animated cartoon strips using the
 * CartoonCharacter class.  
 */
public class CartoonStrip{
    // fields
    private CartoonCharacter casey = new CartoonCharacter(50, 100, "casey");
    private CartoonCharacter bob = new CartoonCharacter(200, 100, "bob");
    private CartoonCharacter alice = new CartoonCharacter(350, 100, "alice");
    
    /** 
     * tellStory creates two cartoon characters on the window.
     * Then animates them according to a fixed script by calling a series
     * of methods on the characters.
     */
    public void tellStory(){
        CartoonCharacter casey = new CartoonCharacter(50, 100, "casey");
        CartoonCharacter bob = new CartoonCharacter(350, 100, "bob");
        casey.lookRight();
        casey.walk(400.0);
        casey.lookLeft();
        casey.speak("BOB!");
        bob.lookRight();
        bob.speak("Yes Casey???");
        casey.speak("Why did the chicken cross the road?");
        bob.speak("I don't know Casey, why?");
        casey.speak("To get to the other side!");
        bob.speak("That wasn't very original");
        casey.speak("Too bad");
    }

    /** 
     * threeDancers creates three cartoon characters on the window.
     * Then makes each character do the same little dance in turn,
     * by calling the dance method.
     */
    public void threeDancers(){
        dance(casey);
        dance(bob);
        dance(alice);
    }

    /** 
     * Makes a character do a little dance.
     * Has one parameter - a CartoonCharacter object
     */
    public void dance(CartoonCharacter face){
        face.lookRight();
        face.lookLeft();
        face.speak("HEY!");
        face.lookRight();
        face.speak("Ta Da!");
    }

}

