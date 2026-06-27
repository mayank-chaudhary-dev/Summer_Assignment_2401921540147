public class TestPoint {

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.display();
        p1.setX(10);
        p1.setY(20);
        p1.display();
        p1.setXY(30, 40);
        p1.display();
        Point p2 = new Point(50, 60);
        p2.display();
    }

}
