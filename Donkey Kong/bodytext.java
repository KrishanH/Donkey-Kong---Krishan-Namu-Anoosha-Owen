import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.*;
/**
 * Write a description of class bodytext here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bodytext extends Actor
{
    public bodytext(String text)
    {
        GreenfootImage img = new GreenfootImage(text.length()*20 , 30 );
        img.setColor(Color.RED);
        img.setFont(new Font("Courier New", 20));
        img.drawString(text,2,20);
        setImage(img);

    }
    
    public void setText(String text){

        GreenfootImage img = getImage();
        img.clear();
        img.drawString(text,2,20);

    }
}
