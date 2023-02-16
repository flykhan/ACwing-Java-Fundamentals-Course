package role.impl;

import role.Hero;

// impl 包里面用于类的实现
public class Zeus implements Hero {
    // final 表示常量
    private final String name = "Zeus";

    // 重写接口方法
    @Override
    public void great() {
        // TODO Auto-generated method stub
        System.out.println(name + ": Hi!");
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println(name + ": Move!");
    }

    @Override
    public int getSpeed() {
        // TODO Auto-generated method stub
        return 10;
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        System.out.println(name + ": Attack!");
    }

}
