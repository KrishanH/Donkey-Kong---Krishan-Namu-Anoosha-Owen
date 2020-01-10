import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Namu extends Actor
{
    int speed;
    
    public void act() 
    {
        speed = speed + 1;
        setLocation( getX(), getY() + speed);
        if(this.getY() > 550){
            setLocation(600, 500);
            //getWorld().removeObjects(getWorld().getObjects(Namu.class));
        }
          if(isTouching(Barrel.class))
        {
            removeTouching(Barrel.class);
            getWorld().addObject(new Namu(), 500, 600);  
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
            move(-3);
            //setImage("mariopixelCopy.png");
            while(isTouching(Floor.class))
            {
                move(1);
                
            } 
            } 
                else {
            if(Greenfoot.isKeyDown("d"))
            {
                move(3);
                //setImage("mariopixel.png");
                //getImage().scale(30,30);
                while(isTouching(Floor.class))
                {
                    move(-1);
                }
            } else{
                //setImage("mario-big.png");
                //getImage().scale(30,30);
            }
        }
        if(Greenfoot.isKeyDown("s"))
        {
            speed = 20;
        }
    }    
}
