import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mushroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mushroom extends Actor
{
    public mushroom()
    {    
        GreenfootImage image = getImage();  
        image.scale(50, 50);
        setImage(image);
    }
    
    /**
     * Act - do whatever the mushroom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        } else{
          setLocation(getX(), getY() + 3);
          while(isTouching(Floor2.class))
          {
            setLocation(getX() - 3, getY() - 3);
            turn(-8);
          }
          while(isTouching(Floor3.class))
          {
            setLocation(getX() - 3, getY() - 2);
            turn(-8);
          }
          while(isTouching(Floor.class))
          {
            setLocation(getX() + 3, getY() - 3);
            turn(8);
          }
          
       }

    }    
}
