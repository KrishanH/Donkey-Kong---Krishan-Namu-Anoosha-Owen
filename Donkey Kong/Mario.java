
import greenfoot.*;
public class Mario extends Actor
{
    int speed;
    String Marioimage = "mariopixelCopy.png";
    long lastTime;
    int Lives = 4;
    int pause = 10;
    GreenfootSound death = new GreenfootSound("deathSound.mp3");
    //private GreenfootSound jump;

    public void act() 
    {
        speed = speed + 1;
        setLocation( getX(), getY() + speed);
        if(this.getY() > 550){
            Lives = 0;
        }
        if(isTouching(Barrel.class))
        {
            removeTouching(Barrel.class);
            getWorld().removeObjects(getWorld().getObjects(red.class));            
            Lives = Lives - 1;
        }
        
        if(Lives == 0)
        {
               death.play();
        Greenfoot.delay(110);
        Greenfoot.setWorld(new endscreen());
            Greenfoot.stop();
        }
        if(speed > 0)
        {
            while(isTouching(Floor.class))
            {
                speed = 0;
                setLocation(getX(), getY() - 1);
                if(Greenfoot.isKeyDown("up"))
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
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
            /*if(System.currentTimeMillis() - lastTime > 500 && Marioimage.equals("mariopixelCopy.png"))
            {
            Marioimage = "marioleft.png";
            setImage("marioleft.png");
            lastTime = System.currentTimeMillis();
            } else {
            if(System.currentTimeMillis() - lastTime > 500)
            {
            Marioimage = "mariopixelCopy.png";
            setImage("mariopixelCopy.png");
            lastTime = System.currentTimeMillis();
            }
            } */

            setImage("mariopixelCopy.png");
            while(isTouching(Floor.class))
            {
                move(1);
            } 
            } 
        
        else {
            if(Greenfoot.isKeyDown("right"))
            {
                move(3);
                setImage("mariopixel.png");
                while(isTouching(Floor.class))
                {
                    move(-1);
                }
            } else{
                setImage("mario-big.png");
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            speed = 50;
        }
    } 
}
