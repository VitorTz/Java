public class RectCollide {

    public static boolean collideRect(Rect r1, Rect r2){
        double[] hzRange = new double[]{r1.getLeft(), r1.getRight()};
        double[] vtRange= new double[]{r1.getTop(), r1.getBottom()};
        double[] r2Vertices = new double[]{r2.getLeft(), r2.getRight(), r2.getTop(), r2.getBottom()};
        for (double v : r2Vertices){
            if (isInRange(hzRange, vtRange, v)){
                return true;
            }
        }
        return false;
    }

    public static boolean isInRange(double[] range, double vertex){
        return (vertex >= range[0] && vertex < range[1]);
    }

    public static boolean isInRange(double[] range1, double[] range2, double vertex){
        return (isInRange(range1, vertex) && isInRange(range2, vertex));
    }
}
