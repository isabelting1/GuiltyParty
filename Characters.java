 

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
    protected int charInt; 
    static protected boolean[] testimony = new boolean[5];
    
    /**
     * Act - do whatever the Characters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        if (canGiveTestimony()) {
            giveTestimony();
        }
    }   
    
    public boolean canGiveTestimony() {
        if (Greenfoot.mousePressed(this) || testimony[charInt]) {
           return true;
        }
        return false;
    }
    
    public void giveTestimony(){
    
    }
}
