import greenfoot.*; 

public class Bomb extends Actor
{
    public void act()
    {
        //constant movement left
        move(-10);
        
        //if apple reaches the end of the screen it is reset
        if(getX()<= 0)
        {
            resetBomb();
        }
        
        //ends game when apple touches the player 
        if(isTouching(Penguin.class))
        {
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    //gets a random position when the projectile resets
    public void resetBomb()
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
