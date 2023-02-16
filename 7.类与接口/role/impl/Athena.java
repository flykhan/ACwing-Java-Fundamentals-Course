package role.impl;

import role.Hero;

public class Athena implements Hero {

    private final String name = "Athena";

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        System.out.println(name + ": Attack!!!");
    }

    @Override
    public int getSpeed() {
        // TODO Auto-generated method stub
        return 20;
    }

    @Override
    public void great() {
        // TODO Auto-generated method stub
        System.out.println(name + ": Hi!!!");
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println(name + ": Move!!!");
    }

}
