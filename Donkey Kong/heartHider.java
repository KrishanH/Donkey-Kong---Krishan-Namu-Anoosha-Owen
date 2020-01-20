import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class heartHider extends Mario
{
    
    int distance = 35;//distance
    
    public void act() //act 
    {

       /* if(MarioInjured == true){
            MarioInjured = false;
        setLocation(getX()+distance,getY());
            MarioLives--;
        }//end outer if
        
        else if(MarioHealth == true){
            MarioHealth = false;
                    setLocation(getX()-distance,getY());
            MarioLives++;
        }//end else if */
        
        //more efficient 
        setLocation((505+35*3)-(distance*MarioLives),getY());//set location
        
    
    }//end act    
}//end class
