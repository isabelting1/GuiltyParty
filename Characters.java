 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Characters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Characters extends Actor
{
    protected boolean longHair;
    protected boolean tallHeight;
    protected boolean thinWeight; 
    protected boolean girlGender; 
    /**
     * Act - do whatever the Characters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        canGiveTestimony();
    }   
    public boolean canGiveTestimony() {
        if (Greenfoot.mousePressed(this)) {
            Confirm confirm = new Confirm();
            Cancel cancel = new Cancel();
            getWorld().addObject(confirm,800,400);
            getWorld().addObject(cancel,800,450);
            if (cancel.isClicked() || confirm.isClicked()) {
                cancel.remove();
                confirm.remove();
                
                getWorld().showText("Gone",100,100);

                boolean clicked = false;
                if (confirm.isClicked()) {
                    clicked = true;
                }
                
                return clicked;
            }
        }
        return false;
    }
}
