import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        //add and create bob Hero
        Hero bob = new Hero();
        addObject(bob, 100, 100);
        
        //add and create projectile enemy
        Apple apple = new Apple();
        addObject(apple, 500, 100);
        
    }
}
