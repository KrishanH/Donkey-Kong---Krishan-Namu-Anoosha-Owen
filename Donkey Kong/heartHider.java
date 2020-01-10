import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class heartHider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class heartHider extends Mario
{
    /**
     * Act - do whatever the heartHider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        if(injured == true){
            injured = false;
        setLocation(getX()+50,getY());
            Lives--;
        }//end outer if
    
    }//end act    
}//end class
