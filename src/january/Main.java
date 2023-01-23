package january;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        try {
            File file = new File("C:\\Users\\assboobs\\IdeaProjects\\untitled\\src\\january\\file2.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                double x = Double.parseDouble(parts[0]);
                double y = Double.parseDouble(parts[1]);
                Point point = new Point(x, y);
                shape.addPoint(point);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }
        List<Point> points = shape.getPoints();
        for (Point point : points) {
            System.out.println("x: " + point.getX() + ", y: " + point.getY());
        }
            double perimeter = shape.Perimeter();
            System.out.println("Perimeter: " + perimeter);
            double longestSide = shape.LongestSide();
            System.out.println("Longest side: " + longestSide);
            double averageLength = shape.AverageLength();
            System.out.println("Average length: " + averageLength);

        }
    }

