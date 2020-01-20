import greenfoot.*;
public class DK extends Actor
{
    long lastTime;//time
    public void act() //act
    {
        if(isTouching(Mario.class))//if dk is touching mario
        {
            Greenfoot.setWorld(new Finish());//finish game
            Mario.points += 500;
        }//end if
        if(isTouching(Namu.class))//if dk is touching namu
        {
            Greenfoot.setWorld(new Finish());//finish game
            Mario.points += 500;
        }//end if
        if(System.currentTimeMillis() - lastTime > 5000)//time
        {
            lastTime = System.currentTimeMillis();//spawn barrel after timeV
            getWorld().addObject(new Barrel(), getX(), getY());
        }
    }//act
}//end class
