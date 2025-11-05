import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        //add and create bob Hero
        Penguin penguin = new Penguin();
        addObject(penguin, 100, 100);
        
        //add and create projectile enemy
        Bomb bomb = new Bomb();
        addObject(bomb, 500, 100);
        
    }
}
