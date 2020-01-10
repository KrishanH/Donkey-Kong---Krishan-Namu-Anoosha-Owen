import greenfoot.*;
public class DK extends Actor
{
    long lastTime;
    public void act() 
    {
        if(isTouching(Mario.class))
        {
            Greenfoot.setWorld(new Finish());

            //Greenfoot.stop();
        }
        if(isTouching(Namu.class))
        {
            Greenfoot.setWorld(new Finish());

            //Greenfoot.stop();
        }
        if(System.currentTimeMillis() - lastTime > 5000)
        {
            lastTime = System.currentTimeMillis();
            getWorld().addObject(new Barrel(), getX(), getY());
        }
    }    //yo
}
