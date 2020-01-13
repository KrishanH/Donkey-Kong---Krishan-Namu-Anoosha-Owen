import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class addhealth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class addhealth extends Mario
{
    /**
     * Act - do whatever the addhealth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(health == true){
            health = false;
            setLocation(getX()+50,getY());
            Lives++;
        }//end outer if

    }    
}
