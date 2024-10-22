package pacake.one;

public abstract class Circle extends Shape {

    private int x,u,radius;

    public Circle(String color) {
        super(color);
    }

    public Circle(String color, int x, int u, int radius) {
        super(color);
        this.x = x;
        this.u = u;
        this.radius = radius;
    }

    @Override
    public void raw() {

    }
}
