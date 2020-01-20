
import greenfoot.*;

public class Mario extends Actor
{
    
    public static int MarioLives = 3;//marios lives
    public static boolean MarioInjured = false;//boolean for marios hitpoints
    public static boolean MarioHealth = false;//boolean for marios health
    int speed;//speed
    public static int points;
    String Marioimage = "mariopixelCopy.png";//marios image
    private GifImage gif = new GifImage("marioRunning1.gif");//mario running gif, doesnt work
    long lastTime;//time
    int pause = 10;//pause
    GreenfootSound death = new GreenfootSound("deathSound.mp3");//death sound

    public void act() 
    {
        speed = speed + 1;//increase speed
        setLocation( getX(), getY() + speed);//set marios location, plus speed
        if(this.getY() > 550){//make it so if mario goes off the bottom, he dies
            MarioLives = 0;//set mario lives to 0
        }//end if
        if(isTouching(Barrel.class))
        {
            removeTouching(Barrel.class);//if mario touches the barrel, remove it
            MarioLives--;
            //MarioInjured = true;//set mario injured to true
        }//end if
        if(isTouching(Coin50.class))
        {
            removeTouching(Coin50.class); 
            points+= 100;
        }
        //add a heart
        if(isTouching(mushroom.class) && MarioLives < 3)//if mario 
        {
            removeTouching(mushroom.class);//remove mushroom
            MarioLives++;
        }
        
        //switch world if lives run out
        if(MarioLives == 0)//if mario has 0 lives
        {
            death.play();//play death sound
            Greenfoot.delay(110);//add delay for death sound to fully play
            Greenfoot.setWorld(new endscreen());//add endscreen
        }
        if(speed > 0)//if mario is moving
        {
            while(isTouching(Floor.class))//while mario is touching the floor
            {
                speed = 0;//set speed to 0
                setLocation(getX(), getY() - 1);//move up
                if(Greenfoot.isKeyDown("up"))//if up is pressed
                {
                    speed = - 20;//lower speed
                    //adding sound
                    GreenfootSound jump = new GreenfootSound("jump.mp3");//play jump sound
                    jump.play();//play jump               
                }//end if
            }//end while
        }
        //going up the ladder
        while(isTouching(Ladder.class) && Greenfoot.isKeyDown("up")){//if mario is touching the ladder and up is pressed
            setLocation(getX(), getY() - 1);//move up, this doesent work as well as i would like it to but i cant find a way to make him move slower
        }//end while
        if(speed <= 0)//if speed is less than 0
        {
            while(isTouching(Floor.class))//while mario is touching the floor
            {
                speed = 0;//set speed to 0
                setLocation(getX(), getY() + 1);//move down
            }
        }    
        if(Greenfoot.isKeyDown("left"))//if left is pressed 
        {
            move(-3);//move left
 
            //setImage(marioRunning.getCurrentImage());// this is for the gif image, if doesnt really work(im not sure why, something wrong with image file)
            setImage("mariopixelCopy.png");//set marios image
            //getImage().scale(30,30); scale image, dont need this

            while(isTouching(Floor.class))//while touching floor
            {
                move(1);//move 

            } //end while
        } //end if

        else {//else if key pressed is right
            if(Greenfoot.isKeyDown("right"))
            {
                move(3);//move right
                setImage("mariopixel.png");//set image 
                //setImage(gif.getCurrentImage()); gif image, doesent work well(concept is shown)
                //getImage().scale(30,30);
                while(isTouching(Floor.class))//while mario is touching the floor
                {
                    move(-1);//move 
                }//end while 
            } else{// if mario is not moving
                setImage("mario-big.png");// set marios image 
                //getImage().scale(30,30);
            }
        }//end else
        if(Greenfoot.isKeyDown("down"))//if key pressed is down
        {
            speed = 20;//increase speed(to make him come down faster)
        }//end if
    }//end act 
}//end class
