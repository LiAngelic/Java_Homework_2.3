package circles_array;

public class Circle {
    private Point center;
    private double radius;
    private String colour;

    public Circle(Point center, double radius, String colour) {
        this.center = center;
        this.radius = radius;
        this.colour = colour;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center.toString() +
                ", radius=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }
}
