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
    private CartoonCharacter Casey = new CartoonCharacter(50, 100, "casey");
    private CartoonCharacter Bob = new CartoonCharacter(150, 100, "bob");
    
    /** 
     * tellStory creates two cartoon characters on the window.
     * Then animates them according to a fixed script by calling a series
     * of methods on the characters.
     */
    public void tellStory(){
        Casey.lookRight();
        Casey.walk(300.0);
    }

    /** 
     * threeDancers creates three cartoon characters on the window.
     * Then makes each character do the same little dance in turn,
     * by calling the dance method.
     */
    public void threeDancers(){
        /*# YOUR CODE HERE */
    }

    /** 
     * Makes a character do a little dance.
     * Has one parameter - a CartoonCharacter object
     */
    public void dance(CartoonCharacter face){
        /*# YOUR CODE HERE */
    }

}

