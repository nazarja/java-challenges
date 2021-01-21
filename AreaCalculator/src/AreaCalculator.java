public class AreaCalculator {

    private static final int INVALID = -1;

    public static double area(double radius) {
        if (radius < 0) return INVALID;
        return Math.PI * (radius * radius);
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) return INVALID;
        return x * y;
    }
}
