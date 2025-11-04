import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Apple extends Actor
{
    public void act()
    {
        move(-10);
        
        if(getX()<= 0)
        {
            resetApple();
        }
        
        if(isTouching(Hero.class))
        {
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 150);
            getWorld().removeObject(this);
        }
    }
    
    public void resetApple()
    {
        int num = Greenfoot.getRandomNumber(2);
        
        if(num == 0 )
        {
            setLocation(500, 100);
        }
        else
        {
            setLocation(500, 300);
        }
    }
}
