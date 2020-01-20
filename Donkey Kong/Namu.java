import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Namu extends Actor
{
    //variables
    int speed;
    public static boolean NamuInjured = false;
    public static boolean NamuHealth = false;
    public static int NamuLives = 3;
    GreenfootSound death = new GreenfootSound("deathSound.mp3");
    private GifImage gif = new GifImage("namuRight.gif");
    private GifImage gif2 = new GifImage("namuLeft.gif");

    public void act() 
    {
        speed = speed + 1;
        setLocation( getX(), getY() + speed);

        setImage("namuStand.png");
        if(this.getY() > 550){
            NamuLives = 0;
            //getWorld().removeObjects(getWorld().getObjects(Namu.class));
        }
        while(isTouching(Ladder.class) && Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 1);
        }

        if(NamuLives ==0){
            death.play();
            Greenfoot.delay(110);
            Greenfoot.setWorld(new endscreen());

        }

        if(isTouching(Barrel.class))
        {
            removeTouching(Barrel.class);
            NamuInjured = true;
        }
                if(isTouching(Coin50.class))
        {
            removeTouching(Coin50.class); 
            Mario.points+= 100;
        }
        if(isTouching(mushroom.class) && NamuLives < 3)
        {
            removeTouching(mushroom.class);
            NamuHealth = true;
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
