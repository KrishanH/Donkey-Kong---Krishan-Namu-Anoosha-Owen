import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mushroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mushroom extends Actor
{
    // getting the mushroom to fall and not fall through floors
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
        int mushVelocity;

        if(isTouching(Floor.class)){
            mushVelocity = 0;
        }
        else{
            mushVelocity = 5;
        }

        setLocation(getX(), getY() + mushVelocity);
        if (getY() >= getWorld().getHeight() - 10) {
            getWorld().removeObject(this);
        }

           }    

}    
