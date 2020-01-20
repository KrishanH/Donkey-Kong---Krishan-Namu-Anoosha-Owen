import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Namu extends Actor
{
    //variables
    int speed;//speed variables
    public static int NamuLives = 3;//namus lives
    GreenfootSound death = new GreenfootSound("deathSound.mp3");//deathsound
    private GifImage gif = new GifImage("namuRight.gif");//namuright gif
    private GifImage gif2 = new GifImage("namuLeft.gif");//namuleft gif

    public void act() //act
    {
        speed = speed + 1;// add speed
        setLocation( getX(), getY() + speed);//add speed 

        setImage("namuStand.png");//set image
        if(this.getY() > 550){//if namu is off the map, he dies
            NamuLives = 0;//set lives to 0
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
            NamuLives--;    
        }
                if(isTouching(Coin50.class))
        {
            removeTouching(Coin50.class); 
            Mario.points+= 100;
        }
        if(isTouching(mushroom.class) && NamuLives < 3)
        {
            removeTouching(mushroom.class);
            NamuLives++;
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
