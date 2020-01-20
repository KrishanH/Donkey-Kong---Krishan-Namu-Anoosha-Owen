import greenfoot.*;

public class Barrel extends Actor
{
    public void act() 
    {
        if(isAtEdge())//if barrel is at the edge
        {
            getWorld().removeObject(this);//remove barrel
        }//end if 
        else{//else
          setLocation(getX(), getY() + 3);//move barrel down
          while(isTouching(Floor2.class))//while barrel is touching floor
          {
            setLocation(getX() - 3, getY() - 3);//move barrel 
            turn(-8);//turn barrel         |
            //same for all functions below v 
          }//end while
          while(isTouching(Floor3.class))
          {
            setLocation(getX() - 3, getY() - 2);
            turn(-8);
          }
          while(isTouching(Floor4.class))
          {
            setLocation(getX() - 3, getY() - 2);
            turn(-8);
          }
          while(isTouching(Floor.class))
          {
            setLocation(getX() + 3, getY() - 3);
            turn(8);
          }
          
       }//end else
    }//end act
}//end class
 