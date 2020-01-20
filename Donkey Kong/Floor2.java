import greenfoot.*;

public class Floor2 extends Floor
{
    private int down = 5;//downwards 
    private int up = -3;  //upwards
    private int falling = 3;//falling
    
    public void act() 
    {
        //call functions
        checkIfDown();      
        checkIfUp();    
    }//end act

    public void moveDown()//move floor down
    {
        setLocation(getX(), getY() +down);  //sey y pos to + down
    }//end movedown

    public void moveUp()//move floor up
    {
        setLocation(getX(), getY() +up);  //set y to + up
    }//end move up

    public void checkIfDown() //  check if floor is down
    {
        if (falling == 1)//if falling is 1
        {
            moveDown();//move floor down
        }//end if
    } //end check if down

    public void checkIfUp()   
    {
        if (falling == 0)//if falling is 0
        {
            moveUp();//move floor up
        }//end if

    }//end checkifup

     
}//end class
 