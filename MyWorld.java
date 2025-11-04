import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero bob = new Hero();
        addObject(bob, 100, 100);
        
        Apple apple = new Apple();
        addObject(apple, 400, 100);
        
    }
}
