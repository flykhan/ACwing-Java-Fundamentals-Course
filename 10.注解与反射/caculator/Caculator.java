package caculator;

public class Caculator {
    public String name;

    public Caculator() {
    }

    public Caculator(String name) {
        this.name = name;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int c, int d) {
        return c - d;
    }

    public String toString() {
        return name;
    }
}
