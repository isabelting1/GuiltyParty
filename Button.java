 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isClicked()) {
            getWorld().showText("Clicked",100,this.getY());
        }
    } 
    public boolean isClicked() {
        return Greenfoot.mousePressed(this);
    }
    
    public void remove() {
        getWorld().removeObject(this);
    }
}
