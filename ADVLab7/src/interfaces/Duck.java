/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Ethan
 */
public class Duck extends Animal implements Edible{
    @Override public String sound()
        {return "Tiger: Rwaarrr";}
    
    @Override 
    public String howToEat()
    {
        return "Duck: Roast it";
    }
}
