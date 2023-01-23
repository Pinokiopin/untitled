package january;
import java.util.ArrayList;
import java.util.List;
public class Shape {
    private List<Point> points;
    public Shape() {
        points = new ArrayList<>();
    }
    public void addPoint(Point point) {

        points.add(point);
    }
    public List<Point> getPoints() {

        return points;
    }
    public double Perimeter() {
        double perimeter = 0.0;
        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size());
            perimeter += current.distance(next);
        }
        return perimeter;
    }
    public double LongestSide() {
        double longest = 0.0;
        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size());
            double distance = current.distance(next);
            if (distance > longest) {
                longest = distance;
            }
        }
        return longest;
    }
    public double AverageLength() {
        return Perimeter() / points.size();
    }
}