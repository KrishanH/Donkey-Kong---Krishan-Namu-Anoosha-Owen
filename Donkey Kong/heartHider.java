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
    int distance = 35;
    
    public void act() 
    {

        if(MarioInjured == true){
            MarioInjured = false;
        setLocation(getX()+distance,getY());
            MarioLives--;
        }//end outer if
        
        else if(MarioHealth == true){
            MarioHealth = false;
                    setLocation(getX()-distance,getY());
            MarioLives++;
        }//end else if
    
    }//end act    
}//end class
