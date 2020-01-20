import greenfoot.*;

public class Floor extends Actor
{
    
    public int height, width;//create height and width
    
    protected void addedToWorld(World world){   
        //create floor with following settings - height and width
        height = getWorld().getHeight();
        width = getWorld().getWidth();
        getImage().scale(150, 25);//scale image

    }//end addedtowolrd
}//end class
