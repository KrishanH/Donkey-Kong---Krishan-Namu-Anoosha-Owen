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
    int Ndistance = 35;
    
    public void act() 
    {

      /* if(NamuInjured == true){            
            NamuInjured = false;
        setLocation(getX()+Ndistance,getY());
            NamuLives--;
        }//end outer if
        
        else if(NamuHealth == true){
            NamuHealth = false;
            setLocation(getX()-Ndistance,getY());
            NamuLives++;
        }//end else if 
        */
               setLocation((505+35*3)-(Ndistance*NamuLives),getY());

       
    
    }//end act    
}//end class
