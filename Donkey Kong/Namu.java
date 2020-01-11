import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Namu extends Actor
{
    int speed;
    private GifImage gif = new GifImage("namuRight.gif");
    private GifImage gif2 = new GifImage("namuLeft.gif");
    private int hurt = 0;
    public void act() 
    {
        speed = speed + 1;
        setLocation( getX(), getY() + speed);

        setImage("namuStand.png");
        if(this.getY() > 550){
            setLocation(600, 500);
            //getWorld().removeObjects(getWorld().getObjects(Namu.class));
        }
        if(isTouching(Barrel.class))
        {
            removeTouching(Barrel.class);
            hurt++;
        }
        if(hurt > 3){
            setLocation(600, 500);
        }
        if(speed > 0)
        {
            while(isTouching(Floor.class))
            {
                speed = 0;
                setLocation(getX(), getY() - 1);
                if(Greenfoot.isKeyDown("w"))
                {
                    speed = - 20;
                    GreenfootSound wind = new GreenfootSound("jump.mp3");
                    wind.play();               
                }
            }
        }
        if(speed <= 0)
        {
            while(isTouching(Floor.class))
            {
                speed = 0;
                setLocation(getX(), getY() + 1);
            }
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setImage(gif.getCurrentImage());
            move(-3);
            while(isTouching(Floor.class))
            {
                move(1);

            } 
        } 
        else {
            if(Greenfoot.isKeyDown("d"))
            {
                move(3);
                setImage(gif2.getCurrentImage());
                while(isTouching(Floor.class))
                {
                    move(-1);
                }
            } else{
                setImage("namuStand.png");
                //getImage().scale(30,30);
            }
        }
        if(Greenfoot.isKeyDown("s"))
        {
            speed = 20;
        }
    }    
}
