public class AreaChecker {

    public boolean aboveBelow (Point point, Point other) {
        double y1 = point.getY();
        double y2 = other.getY();
        return (y1 > y2);
    }

    public boolean leftRight(Point point, Point other) {
        double x1 = point.getX();
        double x2 = other.getX();
        return (x1 > x2);
    }
}
