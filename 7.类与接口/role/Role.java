package role;

public interface Role {
    // 接口函数默认为 public 因此这里的 public void great() 可以直接写成 void great()
    public void great();

    public void move();

    public int getSpeed();
}
