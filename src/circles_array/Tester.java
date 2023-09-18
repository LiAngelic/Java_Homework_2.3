package circles_array;

public class Tester {
    private Circle[] circles;
    private int size;

    public Tester(int size) {
        circles = new Circle[size];
        this.size = 0;
    }
    public void addCircle(Circle circle) {
        circles[this.size] = circle;
        this.size++;
    }
    public void printCircles() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(i + ": " + circles[i].toString());
        }
    }
}
