import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class heartHider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NamuHeartHider extends Namu
{
    /**
     * Act - do whatever the heartHider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int distance = 25;
    
    public void act() 
    {

        if(NamuInjured == true){
            NamuInjured = false;
        setLocation(getX()+distance,getY());
            NamuLives--;
        }//end outer if
        
        else if(NamuHealth == true){
            NamuHealth = false;
            setLocation(getX()-distance,getY());
            NamuLives++;
        }//end else if
    
    }//end act    
}//end class
